package com.codekul.Java16SeptSpring.jpamethods.repository;

import com.codekul.Java16SeptSpring.jpamethods.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

//    @Query(value = "select * from student where name= ?")
    Student findByName(String name);

    Student findByNameAndAddress(String name,String address);

    List<Student> findDistinctByNameAndDob(String name, LocalDate dob);
}
