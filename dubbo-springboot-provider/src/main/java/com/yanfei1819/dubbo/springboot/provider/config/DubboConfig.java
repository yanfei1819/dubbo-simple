package com.yanfei1819.dubbo.springboot.provider.config;

import com.sun.org.apache.xpath.internal.operations.String;
import com.yanfei1819.dubbo.api.service.UserService;
import org.apache.dubbo.config.*;
import org.apache.dubbo.registry.Registry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 追梦1819 on 2019-12-09.
 */
@Configuration
public class DubboConfig {

    public ApplicationConfig applicationConfig(){
        ApplicationConfig application = new ApplicationConfig();
        application.setName("xxx");
        return application;
    }

    public RegistryConfig registryConfig(){
        RegistryConfig registry = new RegistryConfig();

        registry.setAddress("10.20.130.230:9090");
        registry.setUsername("aaa");
        registry.setPassword("bbb");
        return registry;
    }

    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(12345);
        protocol.setThreads(200);
        return protocol;
    }


    @Bean
    public ServiceConfig<UserService> userServiceConfig(UserService userService){
        ServiceConfig<UserService> userServiceConfig = new ServiceConfig<>();
        userServiceConfig.setInterface(UserService.class);
        userServiceConfig.setRef(userService);
        userServiceConfig.setVersion("1.1.1");

        // 配置每一个method 信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("");
        methodConfig.setTimeout(1000);

        List<MethodConfig> methodConfigs = new ArrayList<>();
        methodConfigs.add(methodConfig);

        userServiceConfig.setMethods(methodConfigs);




        return userServiceConfig;
    }
}
