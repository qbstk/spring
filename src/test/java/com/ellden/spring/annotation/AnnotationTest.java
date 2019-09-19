package com.ellden.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_annotation.xml") ;
        UserDao userDao = (UserDaoMybatisImpl)applicationContext.getBean( "user" ) ;
        System.out.println(userDao);
    }

}