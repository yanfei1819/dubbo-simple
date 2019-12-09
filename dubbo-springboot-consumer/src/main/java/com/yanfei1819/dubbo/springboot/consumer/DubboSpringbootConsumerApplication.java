package com.yanfei1819.dubbo.springboot.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboSpringbootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
    }

}
