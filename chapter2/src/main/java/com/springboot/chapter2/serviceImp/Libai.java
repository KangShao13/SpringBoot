package com.springboot.chapter2.serviceImp;

import com.springboot.chapter2.service.Animal;
import com.springboot.chapter2.service.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Libai implements Person {

    @Qualifier("cat")   //决定注入哪一个
    @Autowired
     Animal animal=null;


    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.setAnimal(animal);
    }
}
