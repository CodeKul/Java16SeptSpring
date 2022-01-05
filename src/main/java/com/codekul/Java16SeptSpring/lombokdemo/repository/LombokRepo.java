package com.codekul.Java16SeptSpring.lombokdemo.repository;

import com.codekul.Java16SeptSpring.lombokdemo.domain.LombokDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LombokRepo  extends JpaRepository<LombokDemo,Integer> {
}
