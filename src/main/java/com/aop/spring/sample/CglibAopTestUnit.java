package com.aop.spring.sample;

import com.aop.spring.sample.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author zhangbingquan
 * @desc 使用Cglib实现的AOP切面处理
 * @time 2019-12-30 23:34
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Component("com.aop.spring.sample.*")
public class CglibAopTestUnit {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CglibAopTestUnit.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login();
    }
}
