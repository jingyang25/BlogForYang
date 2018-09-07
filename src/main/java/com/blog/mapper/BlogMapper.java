package com.blog.mapper;


import com.blog.pojo.Blog;

import java.util.List;

public interface BlogMapper{

    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);

    Blog selectLastBlog(Integer id);

    Blog selectNextBlog(Integer id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);

    int countAllNum();


    List<Blog> queryAll();

    List<Blog> selectByWord(String word);
    

}