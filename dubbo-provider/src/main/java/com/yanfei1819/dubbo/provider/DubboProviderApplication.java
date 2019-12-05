package com.yanfei1819.dubbo.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
//        SpringApplication.run(DubboProviderApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }

}
