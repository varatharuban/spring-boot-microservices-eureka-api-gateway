package com.rubanelearning.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubanelearning.payment.entity.Payment;
import com.rubanelearning.payment.service.impl.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@PostMapping("/make-payment")
	public Payment makePayment(@RequestBody Payment payment) {
		return paymentService.doPayment(payment);
	}

	@GetMapping("/{orderId}")
	public Payment findPaymentHistoryByOrderId(@PathVariable String orderId) {
		return paymentService.findPaymentHistoryByOrderId(orderId);
	}
}