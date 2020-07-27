package com.springboot.chapter2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public String sayhello(){

        System.out.println();
        System.out.println();
        System.out.println();
        return "hello 80!!!";
    }


}
