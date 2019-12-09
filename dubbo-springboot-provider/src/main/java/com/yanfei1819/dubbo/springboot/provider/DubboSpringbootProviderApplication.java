package com.yanfei1819.dubbo.springboot.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * SpringBoot与Dubbo整合的三种方式：
 *
 * 1.引入dubbo启动器，以在application.properties文件中配置dubbo.xml的的信息，
 * 然后通过@Service 暴露服务，和 @Reference 发现服务，并通过@DubboEnable开启注解功能；
 *
 * 2.保留dubbo.xml文件。
 *      1) 以@ImportResource(locations = "classpath:provider.xml")取代@EnableDubbo
 *      2）//@org.apache.dubbo.config.annotation.Service 删除
 *
 * 3.使用注解api
 *      1) 将每一个组件都放到手动创建的容器中
 *      2) 使用@EnableDubbo扫描包路径
 *      3） @org.apache.dubbo.config.annotation.Service // 暴露服务
 */
//@EnableDubbo // 开启基于注解的功能
@EnableDubbo(scanBasePackages = "com.yanfei1819.dubbo.springboot.provider")
//@ImportResource(locations = "classpath:provider.xml")
@SpringBootApplication
public class DubboSpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootProviderApplication.class, args);
    }

}
