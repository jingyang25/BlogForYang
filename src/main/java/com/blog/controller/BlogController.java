package com.blog.controller;

import com.blog.pojo.Blog;
import com.blog.pojo.Comment;
import com.blog.service.BlogService;
import com.blog.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.net.nntp.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService  blogService;

    @Autowired
    private CommentService commentService;

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    @RequestMapping("/blog")
    public ModelAndView  detail(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));

        List<Comment> commentList = commentService.allComments(id,0,10);

        Blog blog = blogService.selectById(id);

        Blog lastBlog = blogService.selectLastBlog(id);

        Blog nextBlog = blogService.selectNextBlog(id);

        Integer clickNum = blog.getClickvolume();

       blog.setClickvolume(clickNum+1);

       blogService.updateBlog(blog);

       ModelAndView modelAndView = new ModelAndView("detail");

       modelAndView.addObject("blog",blog);
       modelAndView.addObject("comments",commentList);
       modelAndView.addObject("lastBlog",lastBlog);
       modelAndView.addObject("lastBlog",lastBlog);
       modelAndView.addObject("nextBlog",nextBlog);
       return modelAndView;
    }


    @RequestMapping("/comment")
    public ModelAndView  getBlogComment(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        List<Comment> comments = commentService.allComments(id,0,10);
        ModelAndView  modelAndView = new ModelAndView("/blog/comment_list");
        modelAndView.addObject("comments",comments);
        return modelAndView;
    }

    @RequestMapping("/list")
    public ModelAndView blogList(@RequestParam(required=true,defaultValue="1") Integer page, @RequestParam(required=false,defaultValue="10") Integer pageSize){

        PageHelper.startPage(page,pageSize);
        List<Blog> blogs = blogService.queryAll();
        PageInfo<Blog> pageInfo = new PageInfo<Blog>(blogs);
        ModelAndView modelAndView = new ModelAndView("/blog/blog_list");
        modelAndView.addObject("blogs",blogs);
        modelAndView.addObject("pageInfo",pageInfo);
        return  modelAndView;
    }


    @RequestMapping("/add")
    public ModelAndView blogAdd(){
      ModelAndView modelAndView = new ModelAndView("/blog/blog_add");

      return modelAndView;
    }


    @RequestMapping("/toAdd")
    public String blogAddBefore(HttpServletRequest request, RedirectAttributes redirectAttributes){

        Blog blog = new Blog();

        blog.setTitle(request.getParameter("title"));
        blog.setContent(request.getParameter("content"));
        blog.setKeywords(request.getParameter("keywords"));
        blog.setSort(request.getParameter("sort"));
        blog.setCreatetime(df.format(new Date()));
        blog.setTypeid(request.getParameter("typeid"));

        if(blogService.insert(blog)){
            redirectAttributes.addFlashAttribute("success","发表文章成功");
            return "redirect:/blog/add";
        }else{
            redirectAttributes.addFlashAttribute("error","发表文章失败");
            return "redirect:/blog/add";
        }
    }

    @RequestMapping("/search")
    public ModelAndView blogSearch(HttpServletRequest request){
        String word = request.getParameter("word");

        List<Blog> blogList = blogService.selectByWord(word);

        ModelAndView modelAndView = new ModelAndView(("/blog/blog_edit"));
        modelAndView.addObject("blog",blogList);
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView  blogEdit(HttpServletRequest request ){

        int id  = Integer.parseInt(request.getParameter("id"));
        Blog blog = blogService.selectById(id);
        ModelAndView modelAndView = new ModelAndView("/blog/blog_edit");

        return modelAndView;
    }

    @RequestMapping("/toEdit")
    public ModelAndView  blogEditBefore(HttpServletRequest request){
      Blog blog = new Blog();
      blog.setId(Integer.parseInt(request.getParameter("id")));
      blog.setTitle(request.getParameter("title"));
      blog.setTypeid(request.getParameter("typeid"));
      blog.setKeywords(request.getParameter("keywords"));
      blog.setSort(request.getParameter("sort"));
      blog.setContent(request.getParameter("content"));

      ModelAndView modelAndView = new ModelAndView("/blog/blog_edit");
      if(blogService.updateBlog(blog)){
          modelAndView.addObject("sucess","修改文章成功");
      }else{
          modelAndView.addObject("error","修改文章失败");
      }

      return modelAndView;
    }


    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public @ResponseBody Object loginCheck(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));
        int result = blogService.deleteById(id);

        HashMap<String,String>  res = new HashMap<String, String>();

        if(result==1){
            res.put("stateCode","1");
        }else{
            res.put("stateCode","0");
        }

        return res;

    }



}
