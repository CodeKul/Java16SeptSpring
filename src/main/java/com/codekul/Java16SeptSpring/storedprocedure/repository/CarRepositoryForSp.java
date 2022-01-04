package com.codekul.Java16SeptSpring.storedprocedure.repository;

import com.codekul.Java16SeptSpring.onetomany.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CarRepositoryForSp extends JpaRepository<Car,Integer> {


    @Query(value = "{call getCarData1()}",nativeQuery = true)
    List<Map<String,String>> getCarDetails();

}
