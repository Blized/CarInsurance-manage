package com.demo.mapper;

import com.demo.pojo.Sys_user_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from sys_user_info where userAccount=#{userAccount} and userPwd=#{userPwd}")
    Sys_user_info login(@Param("userAccount") String userAccount,@Param("userPwd") String userPwd);
}
