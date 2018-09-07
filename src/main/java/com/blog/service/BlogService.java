package com.blog.service;

import com.blog.pojo.Blog;

import java.util.List;

/**
 * 博客
 */
public interface BlogService {

    Blog selectById (Integer id);

    Blog selectLastBlog (Integer id);

    Blog selectNextBlog (Integer id);

    List<Blog> queryAll();

    int countAllNum();

    boolean updateBlog(Blog Blog);

    int deleteById(Integer id);

    int selectCount();

    List<Blog> selectByWord(String word);

    boolean insert(Blog Blog);
}
