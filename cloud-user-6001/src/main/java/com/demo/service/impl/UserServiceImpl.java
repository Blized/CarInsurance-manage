package com.demo.service.impl;

import com.demo.mapper.UserMapper;
import com.demo.pojo.Sys_user_info;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public Sys_user_info login(String userAccount, String userPwd) {
        return userMapper.login(userAccount,userPwd);
    }
}
