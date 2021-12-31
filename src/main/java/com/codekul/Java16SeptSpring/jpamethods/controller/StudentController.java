package com.codekul.Java16SeptSpring.jpamethods.controller;

import com.codekul.Java16SeptSpring.jpamethods.domain.Student;
import com.codekul.Java16SeptSpring.jpamethods.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    @RequestMapping(value = "saveStudent")
    public String saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student saved";
    }

    @GetMapping("getStudent")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("getStudentByName/{name}")
    public Student getStudent(@PathVariable("name") String name) {
        return studentRepository.findByName(name);
    }

    @GetMapping("getStudentByNameAndAddress")
    public Student getStudent(@RequestParam String name,
                              @RequestParam String address) {
        return studentRepository.findByNameAndAddress(name, address);
    }
}
