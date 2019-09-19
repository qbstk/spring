package com.ellden.spring.annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("user")  //相当于在配置文件中配置了<bean id = "user" class = "com.ellden.spring.annotation.UserDaoMybatisImpl"></bean>
public class UserDaoMybatisImpl implements UserDao {
    /**
     * 属性注入有set方法在set方法上使用注解，没有set方法在属性上使用注解
     */
    @Value( "张三" )
    public String userName ;
    public int age ;

    @Value( "20" )
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "UserDaoMybatisImpl{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void save() {
        System.out.println("UserDaoMybatisImpl save方法执行了。。。");
    }

    public UserDaoMybatisImpl() {
        System.out.println("UserDaoMybatisImpl的构造方法被调用了");
    }

}
