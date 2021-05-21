package com.demo.controller;

import com.demo.pojo.Menu;
import com.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system")
public class MenuController {
    @Autowired
    MenuService service;

    @RequestMapping("getMenus")
    public List<Menu> getMenus(){
        return service.getMenus();
    }
}
