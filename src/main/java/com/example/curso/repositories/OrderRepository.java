package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
