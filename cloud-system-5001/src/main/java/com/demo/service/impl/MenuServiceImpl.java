package com.demo.service.impl;

import com.demo.mapper.MenuMapper;
import com.demo.pojo.Menu;
import com.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenus() {
        return menuMapper.getMenus();
    }
}
