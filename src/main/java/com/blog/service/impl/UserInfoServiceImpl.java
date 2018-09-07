package com.blog.service.impl;


import com.blog.mapper.UserInfoMapper;
import com.blog.pojo.UserInfo;
import com.blog.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserInfoServiceImpl implements UserInfoService{

    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);


    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo getById(Integer id) {

        UserInfo info= null;
        try {
            info = userInfoMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("查询用户信息失败！"+info);
        }

        return info;
    }
}
