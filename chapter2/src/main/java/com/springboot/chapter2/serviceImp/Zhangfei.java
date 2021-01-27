package com.springboot.chapter2.serviceImp;

import com.springboot.chapter2.service.Animal;
import com.springboot.chapter2.service.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zhangfei implements Person {

    private  Animal animal=null;

    public Zhangfei(@Autowired @Qualifier("dog") Animal animal){
        this.animal=animal;
    }
    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.setAnimal(animal);
    }
}
