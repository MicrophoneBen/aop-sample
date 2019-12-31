package com.aop.spring.sample.controller;

import com.aop.spring.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangbingquan
 * @desc 登录Controller
 * @time 2019-12-30 22:30
 */
@RestController
public class loginController {
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public boolean login(){
        userService.login();
        return false;
    }
}
