package com.springboot.chapter2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
     @Value("1")
    private Long id;
    @Value("1l")
    private String userName;
    @Value("1l")
    private String note ;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getNote() {
        return note;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
