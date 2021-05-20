package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 保单信息表
 */
public class Warranty_info {
    /**
     * 保单编号
     */
    private String warrantyId;
    /**
     * 投保人
     */
    private int policyholdersId;
    /**
     * 被保人
     */
    private int recognizeeId;
    /**
     * 被保车牌号
     */
    private String licenseId;
    /**
     * 签单日期
     */
    private String permissionTime;
    /**
     * 保单类型(1.交强险 2.商业险)
     */
    private int warrantyType;
    /**
     * 保单状态（1.正常 2.注销 3.退保）
     */
    private int warrantyState;
    /**
     * 缴费时间
     */
    private String paymentTime;
    /**
     * 保费总额
     */
    private double premiumTotal;
    /**
     * 保险起期
     */
    private String insuranceBeginTime;
    /**
     * 保险止期
     */
    private String insuranceEndTime;
}
