package com.blog.service;

import com.blog.pojo.UserLoginMark;

import java.util.List;

public interface UserLoginMarkService {

    List<UserLoginMark> selectRencent(Integer userId);

    int insert(UserLoginMark mark);

    int selectCountByUserId(int userId);


}
