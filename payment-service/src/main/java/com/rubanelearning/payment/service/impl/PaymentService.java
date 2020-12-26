package com.rubanelearning.payment.service.impl;

import com.rubanelearning.payment.entity.Payment;

public interface PaymentService {

	Payment doPayment(Payment payment);

	Payment findPaymentHistoryByOrderId(String orderId);
}