package com.kang.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Test {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("hello")
    public static String  sayhello(){
        return "hello,boy!!!!";
    }
    @RequestMapping("getall")
    public Map<String,Object> getall(){
        List<Map<String, Object>> list=jdbcTemplate.queryForList("select * from student");
        return list.get(0);
    }
}
