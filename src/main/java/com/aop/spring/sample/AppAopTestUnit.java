package com.aop.spring.sample;

import com.aop.spring.sample.service.UserService;
import com.aop.spring.sample.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangbingquan
 * @desc AOP的单元测试类
 * @time 2019-12-30 23:26
 */
@EnableAspectJAutoProxy
@ComponentScan("com.aop.spring.sample.*")
public class AppAopTestUnit {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppAopTestUnit.class);
//        UserService userService  = applicationContext.getBean(UserService.class);
        UserService userService  = (UserService) applicationContext.getBean("userService");
        userService.login();
    }
}
