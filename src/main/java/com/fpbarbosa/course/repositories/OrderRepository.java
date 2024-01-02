package com.fpbarbosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpbarbosa.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
} 