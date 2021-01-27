package com.springboot.chapter2.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static javafx.scene.input.KeyCode.T;


@Component
@PropertySource("classpath:application.properties")
//@ConfigurationProperties(prefix = "user",ignoreUnknownFields = false)
public class User {
    @Value("#{user1.getId()}")  //得到容器中beanname为user1的id   在appconfig中配置的，是1
    private  int id;
    @Value("${user.username}")
    private  String username;
    @Value("${user.note}")
    private  String note ;

    @Value("#{T(System).currentTimeMillis()}")
    private Long datatime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", note='" + note + '\'' +
                ", datatime=" + datatime +
                '}';
    }

    public void setDatatime(Long datatime) {
        this.datatime = datatime;
    }

    public Long getDatatime() {
        return datatime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
