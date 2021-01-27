package com.springboot.chapter2.serviceImp;

import com.springboot.chapter2.service.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
//    @Primary      //优先使用，但是单独使用不行
    public void use() {
        System.out.println("这是猫猫的使用");
    }
}
