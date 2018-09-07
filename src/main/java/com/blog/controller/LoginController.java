package com.blog.controller;
import com.blog.service.UserInfoService;
import com.blog.service.UserLoginMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserLoginMarkService userLoginMarkService;
    @Autowired
    private UserInfoService infoService;


    @RequestMapping("/loginCheck")
    public Object loginCheck(HttpServletRequest request, HttpServletResponse response){

        return null;

    }


}
