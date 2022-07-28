package com.xue.springcloud.dao;

import com.xue.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xxx
 * @create 2022-07-28 14:46
 */
@Mapper
public interface PaymentDao {



    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


    //删除
    //修改




}
