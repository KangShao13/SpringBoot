package com.springboot.chapter2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public String sayhello(){

        return "hello 80!!!";
    }

    @RequestMapping("/index")
    public String toindex(){

        return "index";
    }

}
