package com.yanfei1819.dubbo.springboot.consumer.controller;

import com.yanfei1819.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 追梦1819 on 2019-12-06.
 */
@RequestMapping("/")
@RestController
public class OrderController {

    @Autowired
    private UserService userService;

    @GetMapping("/init")
    public void init(){
        String msg = userService.sayHello("dubbo");
        System.out.println(msg);
    }
}
