package com.springboot.chapter2.service;

import com.springboot.chapter2.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void getUser(User user){
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getNote());
    }
}

