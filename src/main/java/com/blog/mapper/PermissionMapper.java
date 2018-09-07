package com.blog.mapper;


import com.blog.pojo.Permission;

import java.util.List;

public interface PermissionMapper{

    /**
     * 新增
     * @param
     * @return
     */
    int insert(Permission permission);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    Permission findById(Integer id);

    /**
     * 修改
     * @param
     * @return
     */
    int update(Permission  permission);

    /**
     * 分页
     */
    int count(Permission permission);

    /**
     * 查询列表
     * @param
     * @return
     */
    List<Permission> select(Permission permission);

}