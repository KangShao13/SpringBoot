package com.springboot.chapter2;

import com.springboot.chapter2.config.Appconfig;
import com.springboot.chapter2.config.DataBaseProperties;
import com.springboot.chapter2.config.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Chapter2Application {

    public static void main(String[] args) {

        SpringApplication.run(Chapter2Application.class, args);

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Appconfig.class);
        User user2= (User) applicationContext.getBean(User.class);
        DataBaseProperties dataBaseProperties=applicationContext.getBean(DataBaseProperties.class);
        System.out.println(user2.toString());

    }

}
