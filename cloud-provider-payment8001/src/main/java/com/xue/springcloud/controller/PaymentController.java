package com.xue.springcloud.controller;

import com.xue.springcloud.PaymentMain8001;
import com.xue.springcloud.entities.CommonResult;
import com.xue.springcloud.entities.Payment;
import com.xue.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xxx
 * @create 2022-07-28 17:03
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        //客户服务里面传过来的就是对象了，要加RequestBody
        int result = paymentService.create(payment);
        log.info("-------插入{}条{}-----",result,payment);
        if(result>0){
            return new CommonResult(200,"插入数据成功",result);
        }else{
            return new CommonResult(444,"插入失败",null);
        }

    }


    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("---查询一条信息:{}---",paymentById.toString());

        if(paymentById!=null){
            return new CommonResult<>(200,"查询成功",paymentById);
        }else{
            return new CommonResult(444,"查询失败",paymentById);
        }


    }







}
