package com.codekul.Java16SeptSpring.servicedemo.repository;

import com.codekul.Java16SeptSpring.servicedemo.model.EmployeeService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeServRepository extends JpaRepository<EmployeeService,Integer> {
}
