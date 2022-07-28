package com.xue.springcloud.service.impl;

import com.xue.springcloud.dao.PaymentDao;
import com.xue.springcloud.entities.Payment;
import com.xue.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xxx
 * @create 2022-07-28 17:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    /**
     * 插入
     * @param payment
     * @return
     */
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    /**
     * 查询
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }





}
