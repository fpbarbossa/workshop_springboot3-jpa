package com.fpbarbosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpbarbosa.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
  
} 