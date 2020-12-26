package com.rubanelearning.payment.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubanelearning.payment.entity.Payment;
import com.rubanelearning.payment.repository.PaymentRepository;
import com.rubanelearning.payment.service.impl.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	
	@Override
	public Payment doPayment(Payment payment) { 
		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setStatus(new Random().nextBoolean() ? "success" : "failed");
		payment.setStatus("success");
		
		return paymentRepository.save(payment);
	}

	@Override
	public Payment findPaymentHistoryByOrderId(String orderId) {
		return paymentRepository.findByOrderId(orderId);
	}

}