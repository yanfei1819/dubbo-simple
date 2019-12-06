package com.yanfei1819.dubbo.springboot.provider.service.impl;

import com.yanfei1819.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 步骤：
 * 1.将服务提供者注册到注册中心；
 *      1） 引入dubbo
 *      2） 引入zookeeper客户端
 * 2.让消费者去注册中心订阅发布者的地址
 *
 * Created by 追梦1819 on 2019-12-04.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
