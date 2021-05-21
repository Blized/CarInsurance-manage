package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 菜单表
 */
public class Menu {
    /**
     * 菜单标号
     */
    private String id;
    /**
     * 菜单标题
     */
    private String title;
    /**
     * 菜单链接地址
     */
    private String linkto;
}
