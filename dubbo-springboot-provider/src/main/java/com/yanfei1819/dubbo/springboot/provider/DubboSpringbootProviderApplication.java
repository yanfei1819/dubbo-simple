package com.yanfei1819.dubbo.springboot.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo // 开启基于注解的功能
@SpringBootApplication
public class DubboSpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootProviderApplication.class, args);
    }

}
