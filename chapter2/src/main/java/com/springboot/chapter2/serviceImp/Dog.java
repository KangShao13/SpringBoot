package com.springboot.chapter2.serviceImp;

import com.springboot.chapter2.service.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("这是狗狗的使用");
    }
}
