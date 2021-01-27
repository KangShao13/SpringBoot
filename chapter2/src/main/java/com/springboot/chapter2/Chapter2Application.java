package com.springboot.chapter2;

import com.springboot.chapter2.config.Appconfig;
import com.springboot.chapter2.pojo.DataBase;
import com.springboot.chapter2.pojo.User;
import com.springboot.chapter2.service.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@SpringBootApplication
@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true)
public class Chapter2Application {

    public static void main(String[] args) {

        SpringApplication.run(Chapter2Application.class, args);

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Appconfig.class);


        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("-----------------------");
        for(String beanname:beanDefinitionNames){
            System.out.println(beanname);
        }
        System.out.println("-----------------------");


        User user3= (User) applicationContext.getBean("user");
        System.out.println(user3.toString());
////        DataBaseProperties dataBaseProperties=applicationContext.getBean(DataBaseProperties.class);
//        System.out.println(user2.toString());
        User user2= (User) applicationContext.getBean("user1");
        User user1= (User) applicationContext.getBean("user1");
        System.out.println(user1==user2);
        DataSource dataSource = (DataSource) applicationContext.getBean("getDataSource");
        System.out.println(dataSource.toString());
        Person zhangfei = (Person) applicationContext.getBean("zhangfei");
        zhangfei.service();


    }

}
