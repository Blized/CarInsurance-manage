package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 险别信息投保金额、保险费关联表
 */
public class Risk_type_amount_info {
    /**
     * 投保金额/责任限额编号
     */
    private int insured_amount_id;
    /**
     * 保单编号
     */
    private String warrantyId;
    /**
     * 投保金额/责任限额信息
     */
    private String insured_amount;
    /**
     * 险别编号
     */
    private int riskTypeId;
    /**
     * 保额上限
     */
    private double insuredAmount;
    /**
     * 保险费
     */
    private double premium;
    /**
     * 不计免赔
     */
    private int insuredState;
}
