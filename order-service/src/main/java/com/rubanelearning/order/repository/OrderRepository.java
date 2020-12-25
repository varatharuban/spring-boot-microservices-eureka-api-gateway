package com.rubanelearning.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubanelearning.order.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}