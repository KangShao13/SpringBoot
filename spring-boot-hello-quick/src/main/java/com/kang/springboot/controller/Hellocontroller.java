package com.kang.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {


    @RequestMapping("/hello")
    public String Hello() {
        return "Spring-boot-second-helloword!!!!";
    }

    @RequestMapping("/rrr")
    public String lolle(){

        return "dsdsdsd";
    }
}

