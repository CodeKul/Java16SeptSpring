package com.codekul.Java16SeptSpring.onetoone.repository;

import com.codekul.Java16SeptSpring.onetoone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
