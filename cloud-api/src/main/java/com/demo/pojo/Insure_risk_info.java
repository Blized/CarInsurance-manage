package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 保单商业险已投险别
 */
public class Insure_risk_info {
    /**
     * 投保险别主键
     */
    private int insureRiskId;
    /**
     * 保单编号
     */
    private String warrantyId;
    /**
     * 险别编号
     */
    private int riskTypeId;
    /**
     * 投保金额/责任限额编号
     */
    private int insured_amount_id;
    /**
     * 保险费
     */
    private double premium;
}
