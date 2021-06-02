package com.demo.pojo;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 各项定损
 */
public class Audit {
    private List<Car_damage_info> carDamage;
    private List<Object_damage_info> objDamage;
    private List<Human_injury_info> humanDamage;
    private double cartotals;
    private double objtotals;
    private double humantotals;
}
