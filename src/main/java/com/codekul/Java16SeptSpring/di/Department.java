package com.codekul.Java16SeptSpring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {

    int id;
    String name;
    String location;

//    private Employee employee;

    //field based injection
    @Autowired
    private Employee employee;

    //constructor based injection
//    @Autowired
//    public Department(Employee employee) {
//        this.employee = employee;
//    }

    //setter based injection
//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    public void showEmp() {
        employee.show();
    }

}
