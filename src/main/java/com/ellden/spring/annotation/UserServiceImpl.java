package com.ellden.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service("userService")
@Scope("prototype ")
public class UserServiceImpl implements UserService{

//    @Autowired  //默认按类型进行装配
//    @Qualifier("user")  //强制使用名称注入.
    @Resource(name = "user")  //相当于: * @Autowired和@Qualifier一起使用.
    UserDao userDao ;


    @Override
    public void save() {
        System.out.println("UserServiceImpl save 方法执行了。。。");
        userDao.save();
    }

    @PostConstruct  //相当于<bean id ="" class="" init_method=""></bean>
    public void init(){
        System.out.println("UserServiceImpl  init....");
    }

    @PreDestroy     //相当于<bean id ="" class="" destroy_method=""></bean>
    public void destroy(){
        System.out.println("UserServiceImpl  destroy.....");
    }



}
