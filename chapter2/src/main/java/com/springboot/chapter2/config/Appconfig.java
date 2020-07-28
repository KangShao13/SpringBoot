package com.springboot.chapter2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Appconfig {

//    @Bean(name = "user")
//    public User inituser(){
//        User user=new User();
//        user.setId(1L);
//        user.setNote("111");
//        user.setUserName("小八十");
//        return user;
//    }

}
