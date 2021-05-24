package com.demo.service;

import com.demo.pojo.Sys_user_info;

public interface UserService {
    Sys_user_info login(String userAccount, String userPwd);
}
