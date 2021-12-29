package com.codekul.Java16SeptSpring.manytomany.controller;

import com.codekul.Java16SeptSpring.manytomany.domain.Customer;
import com.codekul.Java16SeptSpring.manytomany.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer saved..";
    }
}
