package com.springboot.chapter2.controller;

import com.springboot.chapter2.pojo.DataBase;
import com.springboot.chapter2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private  User user;

    @RequestMapping("/")
    @ResponseBody
    public Map<String, Object> sayhello(){

        Map<String, Object> map = new HashMap<>();
        map.put("id", user.getId());
        map.put("userName", user.getUsername());
        map.put("note", user.getNote());

        return map;

    }

    @RequestMapping("/index")
    public String toindex(){

        return "index";
    }

}
