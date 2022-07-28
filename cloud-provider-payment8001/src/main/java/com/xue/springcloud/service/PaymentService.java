package com.xue.springcloud.service;

import com.xue.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author xxx
 * @create 2022-07-28 16:59
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
