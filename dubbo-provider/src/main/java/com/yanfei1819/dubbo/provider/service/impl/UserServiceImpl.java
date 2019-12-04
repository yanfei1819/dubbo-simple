package com.yanfei1819.dubbo.provider.service.impl;

import com.yanfei1819.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by 追梦1819 on 2019-12-04.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
