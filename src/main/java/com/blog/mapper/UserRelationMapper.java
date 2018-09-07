package com.blog.mapper;

import com.blog.pojo.UserRelation;
import com.blog.pojo.UserRole;

import java.util.List;

public interface UserRelationMapper{

    /**
     * 新增
     * @param
     * @return
     */
    int insert(UserRelation relation);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    UserRelation findById(Integer id);

    /**
     * 修改
     * @param
     * @return
     */
    int update(UserRelation  relation);

    /**
     * 分页
     */
    int count(UserRelation relation);

    /**
     * 查询列表
     * @param
     * @return
     */
    List<UserRelation> select(UserRelation relation);

}