package com.yanfei1819.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboProviderApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"http://10.20.160.198/wiki/display/dubbo/provider.xml"}
                );
        context.start();
        System.in.read(); // 按任意键退出
    }

}
