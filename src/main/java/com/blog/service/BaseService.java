package com.blog.service;

import java.util.List;

public interface BaseService<T> {
    /**
     * 新增
     * @param record
     * @return
     */
    int insert(Class<T> record);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    Class<T> findById(Integer id);

    /**
     * 修改
     * @param record
     * @return
     */
    int update(Class<T> record);

    /**
     * 分页
     */
    int count(Class<T> blog);

    /**
     * 查询列表
     * @param blog
     * @return
     */
    List<Class<T>> select(Class<T> blog);
}
