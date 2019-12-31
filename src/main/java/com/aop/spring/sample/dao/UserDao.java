package com.aop.spring.sample.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author zhangbingquan
 * @desc 用户登录信息的Dao层
 * @time 2019-12-30 23:24
 */
@Repository
@Slf4j
public class UserDao {
    public void login(){
        System.out.println("用户成功登录");
    }
}
