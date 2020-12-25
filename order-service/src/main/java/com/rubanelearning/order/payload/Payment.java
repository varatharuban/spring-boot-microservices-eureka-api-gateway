package com.rubanelearning.order.payload;

import lombok.Data;

@Data
public class Payment {

	private Long id;

	private String transactionId;

	private String status;

	private String orderId;

	private Double amount;
}