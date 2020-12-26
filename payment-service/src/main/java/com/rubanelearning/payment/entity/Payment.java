package com.rubanelearning.payment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Payment extends BaseEntity {

	private static final long serialVersionUID = -2355867558202854099L;

	@Column(name = "TRANSACTION_ID")
	private String transactionId;

	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Column(name = "AMOUNT")
	private Double amount;
}
