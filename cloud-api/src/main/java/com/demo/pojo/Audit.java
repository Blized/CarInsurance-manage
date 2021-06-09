package com.demo.pojo;

import lombok.*;

import java.nio.channels.Pipe;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 各项定损
 */
public class Audit {
    //相关车损
    private List<Car_damage_info> carDamage;
    //相关物损
    private List<Object_damage_info> objDamage;
    //相关人伤
    private List<Human_injury_info> humanDamage;
    //车损总额
    private double cartotals;
    //物损总额
    private double objtotals;
    //人伤总额
    private double humantotals;
    //三者损失总额
    private double trdPartyLiability;
    //应赔偿总额
    private double shouldMoney;
    //已赔偿总额
    private double tplMoney;
    //个人损失赔偿信息
    private PersonalLoss personalLoss;
    //三者损失赔偿信息
    private OthersLoss othersLoss;
}
