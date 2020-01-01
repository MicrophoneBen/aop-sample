package com.aop.spring.sample.loginaop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author zhangbingquan
 * @desc 登录的切面处理类
 * @time 2019-12-30 23:28
 */
@Slf4j
@Component
@Aspect
public class loginAspect {

    @Pointcut("execution(* com.aop.spring.sample.service.*.*(..))")
    private void loginPointCut(){
    }

    @Before("execution(* com.aop.spring.sample.service.*.*(..))")
    private void beforePointCut(){
        System.out.println("前置切点处理，在Service层做一个切面做日志切面");
    }

    @After("execution(* com.aop.spring.sample.service.*.*(..))")
    private void afterPointCut(){
        System.out.println("后置切点处理，在Service层做一个切面做日志切面");
    }

    @Around("execution(* com.aop.spring.sample.service.*.*(..))")
    private Object aroundPointCut(ProceedingJoinPoint pjp){
        log.debug("用户开始登陆");
        long startTime = System.currentTimeMillis();
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("用户登录，耗时 : {}", System.currentTimeMillis() - startTime);
        return new Object();
    }
}
