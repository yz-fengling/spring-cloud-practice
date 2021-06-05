package com.yz.springcloud.service;

import com.yz.springcloud.entities.CommonResult;
import com.yz.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
     @GetMapping(value = "/payment/get/{id}")
     CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id);

     @GetMapping(value = "/payment/feign/timeout")
     public String paymentFeignTimeout();
}
