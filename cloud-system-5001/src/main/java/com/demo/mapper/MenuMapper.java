package com.demo.mapper;

import com.demo.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper {
    @Select("select * from menu")
    List<Menu> getMenus();

    @Select("select * from menu where id not like '%-%'")
    List<Menu> getPmenus();

    @Select("select * from menu where id like #{id}")
    List<Menu> getCmenus(@Param("id") String id);
}
