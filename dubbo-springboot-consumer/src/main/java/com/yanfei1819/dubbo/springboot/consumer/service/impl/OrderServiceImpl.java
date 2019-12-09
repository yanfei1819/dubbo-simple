package com.yanfei1819.dubbo.springboot.consumer.service.impl;

import com.yanfei1819.dubbo.api.service.OrderService;
import com.yanfei1819.dubbo.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 追梦1819 on 2019-12-04.
 */
@Service
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference // 从注册中心发现服务
    private UserService service;

    @Override
    public String getMsg(String name) {

        String msg = service.sayHello(name);

        System.out.println(msg);
        return msg;
    }
}