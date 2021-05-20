package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 系统用户信息表
 */
public class Sys_user_info {
    /**
     * 用户编号
     */
    private int userId;
    /**
     * 账号
     */
    private String userAccount;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 密码
     */
    private int userPwd;
    /**
     * 工号
     */
    private String jobint;
    /**
     * 职位编号
     */
    private int jobId;
    /**
     * 性别
     */
    private String sex;
}
