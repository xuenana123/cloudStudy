package com.xue.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xxx
 * @create 2022-07-28 19:31
 */@Slf4j
@SpringBootApplication

public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
        log.info("启动成功");
    }
}
