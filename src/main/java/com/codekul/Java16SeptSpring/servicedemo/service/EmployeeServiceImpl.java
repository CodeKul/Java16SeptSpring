package com.codekul.Java16SeptSpring.servicedemo.service;

import com.codekul.Java16SeptSpring.servicedemo.model.EmployeeService;
import com.codekul.Java16SeptSpring.servicedemo.repository.EmployeeServRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    @Autowired
    private EmployeeServRepository employeeServRepository;


    @Override
    public void saveEmployee(EmployeeService employeeService) {
        employeeServRepository.save(employeeService);
    }
}
