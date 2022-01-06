package com.codekul.Java16SeptSpring.registration.repository;

import com.codekul.Java16SeptSpring.registration.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Integer> {

    Registration findByNameAndPassword(String name,String password);

}
