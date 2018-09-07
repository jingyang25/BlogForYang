package com.blog.mapper;


import com.blog.pojo.UserRole;

import java.util.List;

public interface UserRoleMapper{
    /**
     * 新增
     * @param
     * @return
     */
    int insert(UserRole userRole);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    UserRole findById(Integer id);

    /**
     * 修改
     * @param
     * @return
     */
    int update(UserRole  userRole);

    /**
     * 分页
     */
    int count(UserRole userRole);

    /**
     * 查询列表
     * @param
     * @return
     */
    List<UserRole> select(UserRole userRole);

}