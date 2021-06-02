package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 理赔信息
 */
public class Claims {
    /**
     * 理赔编号
     */
    private String adjustmentId;
    /**
     * 理赔审核
     */
    private String isVerify;
    /**
     * 保单号
     */
    private String warrantyId;
    /**
     * 车架号
     */
    private String carframeId;
    /**
     * 领取人
     */
    private String receiver;
    /**
     * 赔付金额
     */
    private double settlementTotal;
    /**
     * 签单日期
     */
    private String signDate;
    /**
     * 结案时间
     */
    private String closeCaseTime;
    /**
     * 案件状态
     */
    private String claimStatus;
}
