package com.blog.mapper;



import com.blog.pojo.RolePermission;

import java.util.List;

public interface RolePermissionMapper{
    /**
     * 新增
     * @param
     * @return
     */
    int insert(RolePermission role);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    RolePermission findById(Integer id);

    /**
     * 修改
     * @param
     * @return
     */
    int update(RolePermission  role);

    /**
     * 分页
     */
    int count(RolePermission role);

    /**
     * 查询列表
     * @param
     * @return
     */
    List<RolePermission> select(RolePermission role);

}