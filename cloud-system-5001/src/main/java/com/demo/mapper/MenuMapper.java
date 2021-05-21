package com.demo.mapper;

import com.demo.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper {
    @Select("select * from menu")
    List<Menu> getMenus();
}
