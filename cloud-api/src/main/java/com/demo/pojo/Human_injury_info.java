package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 人伤信息详情表
 */
public class Human_injury_info {
    /**
     * 人伤详情编号
     * hdamage_20210520+车牌后3位+001
     * 001:同车往后+1
     */
    private String humanInjuryId;
    /**
     * 赔案编号
     */
    private String claimMainId;
    /**
     * 伤者姓名
     */
    private String injuredPersonName;
    /**
     * 伤情描述
     */
    private String injuryDesc;
    /**
     * 费用类别
     */
    private String costCategory;
    /**
     * 定损费用小计
     */
    private double lossTotal;
}
