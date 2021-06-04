package com.yz.springcloud.service.impl;

import com.yz.springcloud.dao.PaymentDao;
import com.yz.springcloud.entities.Payment;
import com.yz.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className: PaymentServiceImpl
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 00:23
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
