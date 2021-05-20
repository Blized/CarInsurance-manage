package com.demo.pojo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 险别信息基础表
 */
public class Risk_type_info {
    /**
     * 险别编号
     */
    private int riskTypeId;
    /**
     * 险别名称
     */
    private String riskTypeNameName;
}
