package com.aop.spring.sample.service.impl;

import com.aop.spring.sample.service.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhangbingquan
 * @desc 用户登录Service实现类
 * @time 2019-12-30 22:41
 */
@Service("userService")
@Slf4j
@Data
public class UserServiceImpl implements UserService {

    @Override
    public void login() {
        System.out.println("登录成功");
    }
}
