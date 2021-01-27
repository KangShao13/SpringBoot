package com.springboot.chapter2.serviceImp;

import com.springboot.chapter2.service.HelloService;

public class HelloServiceImp implements HelloService {

    @Override
    public void sayHello(String name) {
        if(name==null || name.trim()==""){
            throw new RuntimeException("名字为空！！！");
        }
        System.out.println("Hello"+name);
    }
}
