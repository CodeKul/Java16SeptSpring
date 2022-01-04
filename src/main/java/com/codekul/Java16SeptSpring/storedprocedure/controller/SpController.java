package com.codekul.Java16SeptSpring.storedprocedure.controller;

import com.codekul.Java16SeptSpring.storedprocedure.repository.CarRepositoryForSp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SpController {

    @Autowired
    private CarRepositoryForSp carRepositoryForSp;

    @GetMapping("getCarDetails")
    public List<Map<String,String>> getCarDetails(){
       return carRepositoryForSp.getCarDetails();
    }
}
