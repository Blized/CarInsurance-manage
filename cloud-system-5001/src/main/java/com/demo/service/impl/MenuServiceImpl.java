package com.demo.service.impl;

import com.demo.mapper.MenuMapper;
import com.demo.pojo.Menu;
import com.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenus() {
        List<Menu> list=new ArrayList<Menu>();
        list=menuMapper.getPmenus();
        getChild(list);
        return list;
    }

    private List<Menu> getChild(List<Menu> menus) {
        for (Menu menu : menus) {
            List<Menu> list=menuMapper.getCmenus(menu.getId()+"-_");
            getChild(list);
            menu.setChildren(list);
        }
        return menus;
    }
}
