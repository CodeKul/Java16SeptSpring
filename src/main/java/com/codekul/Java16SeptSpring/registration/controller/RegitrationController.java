package com.codekul.Java16SeptSpring.registration.controller;

import com.codekul.Java16SeptSpring.registration.domain.Registration;
import com.codekul.Java16SeptSpring.registration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegitrationController {

    @Autowired
    private RegistrationRepo registrationRepo;

    @PostMapping("registration")
    public String registration(@RequestBody Registration registration) {
        registrationRepo.save(registration);
        return "Registration successful....";
    }

    @GetMapping("login")
    public String login(@RequestParam String userName, @RequestParam String password) {
        try {
            Registration registration = registrationRepo.findByNameAndPassword(userName, password);
            if (registration != null) {
                return "Login successfully....";
            } else {
                return "Login Failed";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
