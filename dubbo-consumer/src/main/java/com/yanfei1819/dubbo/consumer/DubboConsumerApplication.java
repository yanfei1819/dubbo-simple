package com.yanfei1819.dubbo.consumer;

import com.yanfei1819.dubbo.api.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) throws IOException {
//        SpringApplication.run(DubboConsumerApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
//        OrderService orderService = context.getBean(OrderService.class);
//        String name = orderService.getMsg("dubbo");
//
//        System.out.println(name);
        context.start();
        System.in.read(); // 按任意键退出
    }

}
