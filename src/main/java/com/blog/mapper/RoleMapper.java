package com.blog.mapper;


import com.blog.pojo.Role;

import java.util.List;

public interface RoleMapper {
    /**
     * 新增
     * @param
     * @return
     */
    int insert(Role role);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    Role findById(Integer id);

    /**
     * 修改
     * @param
     * @return
     */
    int update(Role  role);

    /**
     * 分页
     */
    int count(Role role);

    /**
     * 查询列表
     * @param
     * @return
     */
    List<Role> select(Role role);


}