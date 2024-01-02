package com.fpbarbosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpbarbosa.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
} 