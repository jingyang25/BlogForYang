package com.blog.mapper;

import java.util.List;

public interface BaseMapper<T> {

    /**
     * 新增
     * @param
     * @return
     */
    int insert(T pojo);

    /**
     * 按条件搜索
     * @param id
     * @return
     */
    Class<?> findById(Integer id);

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
