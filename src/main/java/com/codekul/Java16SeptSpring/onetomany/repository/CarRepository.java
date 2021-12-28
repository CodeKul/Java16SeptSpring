package com.codekul.Java16SeptSpring.onetomany.repository;

import com.codekul.Java16SeptSpring.onetomany.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
