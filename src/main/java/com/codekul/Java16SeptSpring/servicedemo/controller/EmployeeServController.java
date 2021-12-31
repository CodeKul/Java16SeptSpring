package com.codekul.Java16SeptSpring.servicedemo.controller;

import com.codekul.Java16SeptSpring.servicedemo.model.EmployeeService;
import com.codekul.Java16SeptSpring.servicedemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeServController {

    @Autowired
    private EmployeeServiceImpl emp;

    @PostMapping("saveEmployeeService")
    public String saveEmployeeService(@RequestBody EmployeeService employeeService){
        emp.saveEmployee(employeeService);
        return "Employee Saved..";
    }
}
