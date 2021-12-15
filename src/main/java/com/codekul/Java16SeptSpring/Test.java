package com.codekul.Java16SeptSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/helloSpring")
    public String getData(){
        return "Hello Spring";
    }

}
