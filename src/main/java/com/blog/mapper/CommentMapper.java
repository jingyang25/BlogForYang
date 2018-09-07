package com.blog.mapper;


import com.blog.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    /**
     * 新增
     * @param
     * @return
     */
    int insert(Comment comment);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    Comment findById(Integer id);

    /**
     * 修改
     * @param
     * @return
     */
    int update(Comment  blog);

    /**
     * 分页
     */
    int count(Comment blog);

    /**
     * 查询列表
     * @param blog
     * @return
     */
    List<Comment> select(Comment blog);
}