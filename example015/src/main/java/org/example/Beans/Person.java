package org.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    String name;
    Vehicle v;
    @Autowired
    public void setvehicle( Vehicle v) {
        this.v = v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        v.functionality();
    }
}
