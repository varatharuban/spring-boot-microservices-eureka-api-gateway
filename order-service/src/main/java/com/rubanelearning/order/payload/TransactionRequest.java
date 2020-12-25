package com.rubanelearning.order.payload;

import com.rubanelearning.order.entity.Order;

import lombok.Data;

@Data
public class TransactionRequest {

	private Order order;
	
	private Payment payment;
}