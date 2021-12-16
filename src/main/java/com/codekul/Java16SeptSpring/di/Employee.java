package com.codekul.Java16SeptSpring.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    int id;
    String name;
    String address;

    public void show(){
        System.out.println("In employee show");
    }

}
