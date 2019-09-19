package com.ellden.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_annotation.xml") ;
        UserService userDao = (UserServiceImpl)applicationContext.getBean( "userService" ) ;
        System.out.println(userDao);
        userDao.save();
    }

    @Test
    /**
     *  生命周期 和 作用域
     */
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_annotation.xml") ;
        UserService userDao = (UserServiceImpl)applicationContext.getBean( "userService" ) ;
        UserService userDao2 = (UserServiceImpl)applicationContext.getBean( "userService" ) ;
        System.out.println(userDao == userDao2);
        applicationContext.close();
    }
    @Test
    /**
     *  xml与注解整合使用
     */
    public void demo3(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_annotation.xml") ;
        OrderService orderService = (OrderServiceImpl)applicationContext.getBean( "orderService" ) ;
        orderService.save();
    }

}