package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 赔案主档表
 * PS:登记报案信息后，根据报案人及出险司机查找是否有该被保人，再根据被保人保单登记赔案
 */
public class Claim_main_info {
    /**
     * 赔案号
     */
    private String claimMainId;
    /**
     * 报案号
     */
    private String caseReportId;
    /**
     * 保单号
     */
    private String warrantyId;
    /**
     * 立案时间
     */
    private String filingTime;
    /**
     * 结案时间
     */
    private String closeCaseTime;
    /**
     * 赔案主状态（1.已报案 2已立案 3已结案 4已撤案）
     */
    private String claimStatus;
}
