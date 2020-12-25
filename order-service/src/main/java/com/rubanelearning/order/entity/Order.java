package com.rubanelearning.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Order extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "QTY")
	private Integer qty;

	@Column(name = "AMOUNT")
	private Double amount;
}