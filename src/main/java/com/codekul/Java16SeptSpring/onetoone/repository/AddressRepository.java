package com.codekul.Java16SeptSpring.onetoone.repository;

import com.codekul.Java16SeptSpring.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
