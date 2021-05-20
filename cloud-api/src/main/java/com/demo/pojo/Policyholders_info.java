package com.demo.pojo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 投保人信息表
 */
public class Policyholders_info {
    /**
     * 投保人编号
     */
    private int policyholdersId;
    /**
     * 投保人姓名
     */
    private String policyholdersName;
    /**
     * 性别
     */
    private String sex;
    /**
     * 证件类型
     */
    private String credentialsType;
    /**
     * 证件号码
     */
    private String credenId;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 联系地址
     */
    private String address;
}
