package com.blog.mapper;


import com.blog.pojo.UserLoginMark;

import java.util.List;

public interface UserLoginMarkMapper{

    int deleteByPrimaryKey(Long id);

    int insert(UserLoginMark mark);

    int insertSelective(UserLoginMark mark);

    UserLoginMark selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoginMark mark);

    int updateByPrimaryKey(UserLoginMark mark);

    List<UserLoginMark> queryAll();

    List<UserLoginMark> selectRencent(Integer userId);

    int selectCountByUserId(Integer userId);

}