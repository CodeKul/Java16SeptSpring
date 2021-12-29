package com.codekul.Java16SeptSpring.manytomany.repository;

import com.codekul.Java16SeptSpring.manytomany.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
