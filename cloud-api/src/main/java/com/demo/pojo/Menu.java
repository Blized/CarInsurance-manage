package com.demo.pojo;

import lombok.*;

import java.util.List;

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
    /**
     * 子菜单
     */
    private List<Menu> children;
}
