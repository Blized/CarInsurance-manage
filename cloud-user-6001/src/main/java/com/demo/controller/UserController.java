package com.demo.controller;

import com.demo.pojo.Sys_user_info;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value = "/login",produces = {"application/json;charset=UTF-8"})
    public Sys_user_info login(String userAccount,String userPwd){
        return service.login(userAccount,userPwd);
    }
}
