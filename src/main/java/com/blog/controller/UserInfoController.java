package com.blog.controller;
import com.blog.pojo.UserInfo;
import com.blog.pojo.UserLoginMark;
import com.blog.service.BlogService;
import com.blog.service.CommentService;
import com.blog.service.UserLoginMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {


    @Autowired
    private BlogService blogService;

    @Autowired
    private UserLoginMarkService markService;

    @Autowired
    private CommentService commentService;

    Date date = new Date();
    //设置日期格式
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    @RequestMapping("/main")
   public  ModelAndView  toMain(HttpServletRequest request){

       ModelAndView modelAndView = new ModelAndView("admin/main");

       String clientIp = request.getRemoteAddr();
       String hostIp = request.getLocalAddr();
       int hostPort = request.getLocalPort();
       String time = df.format(date);

       //获取用户的登录信息
       UserInfo info  = (UserInfo) request.getSession().getAttribute("userInfo");

       UserLoginMark  mark = null;

       try {
           if(markService.selectRencent(info.getId())!=null&&markService.selectRencent(info.getId()).size()==2){

               List<UserLoginMark> markList = markService.selectRencent(info.getId());
               mark = markList.get(1);
           }
       } catch (Exception e) {

           e.printStackTrace();

       } finally {
           int blogCount = blogService.selectCount();
           int commentCount = commentService.countAllNum();
           int loginNum = markService.selectCountByUserId(info.getId());

           modelAndView.addObject("clientIp",clientIp);
           modelAndView.addObject("hostIp",hostIp);
           modelAndView.addObject("hostPort",hostPort);
           modelAndView.addObject("time",time);
           if(mark!=null){
               modelAndView.addObject("mark",mark);
           }
           modelAndView.addObject("blogCount",blogCount);
           modelAndView.addObject("commentCount",commentCount);
           modelAndView.addObject("loginNum",loginNum);
           return modelAndView;
       }
   }




}
