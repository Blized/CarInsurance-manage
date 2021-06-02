package com.demo.pojo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 被保人信息表
 */
public class Recognizee_info {
    /**
     * 被保人编号
     */
    private int recognizeeId;
    /**
     * 被保人姓名
     */
    private String recognizeeName;
    /**
     * 性别
     */
    private String sex;
    /**
     * 投保人编号
     */
    private int policyholdersId;
    /**
     * 证件类型
     */
    private String credentialsType;
    /**
     * 证件号码
     */
    private String credentialsId;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 银行账户
     */
    private int bankAccount;
    /**
     * 驾驶证号码
     */
    private String driverId;
}
