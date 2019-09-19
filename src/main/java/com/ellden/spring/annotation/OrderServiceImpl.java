package com.ellden.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


public class OrderServiceImpl implements OrderService{

    @Resource(name = "orderDao")
    OrderDao orderDao ;

    @Override
    public void save() {
        System.out.println("UserServiceImpl save 方法执行了。。。");
        orderDao.save();
    }


}
