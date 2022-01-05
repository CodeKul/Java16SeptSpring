package com.codekul.Java16SeptSpring.lombokdemo.controller;

import com.codekul.Java16SeptSpring.lombokdemo.domain.LombokDemo;
import com.codekul.Java16SeptSpring.lombokdemo.repository.LombokRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LombokController {

    @Autowired
    private LombokRepo lombokRepo;

    @PostMapping("saveLombok")
    public String saveLombok(@RequestBody LombokDemo lombokDemo){
        lombokRepo.save(lombokDemo);
        return "Saved..";
    }

    @GetMapping("getLombok")
    public List<LombokDemo> getData(){
        return lombokRepo.findAll();
    }
}
