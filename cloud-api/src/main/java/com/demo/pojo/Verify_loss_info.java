package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 核损信息表
 */
public class Verify_loss_info {
    /**
     * 核损编号
     */
    private String verifyLossId;
    /**
     * 赔案编号
     */
    private String claimMainId;
    /**
     * 核损费用小计（车、物、人相加的费用总计）
     */
    private double verifyLossCost;
    /**
     * 核损日志
     */
    private String verifyLossOpinion;
}
