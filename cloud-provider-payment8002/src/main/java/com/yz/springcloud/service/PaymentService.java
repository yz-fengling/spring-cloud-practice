package com.yz.springcloud.service;

import com.yz.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Integer id);
}
