package com.ellden.spring.ioc;

public class UserDaoMybatisImpl implements UserDao {
    public String userName ;
    public int age ;
    public Car car ;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoMybatisImpl() {
        System.out.println("UserDaoMybatisImpl的构造方法被调用了");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void save() {
        System.out.println("save mybatis impl...userName="+userName+"；age="+age +" ;  car="+car);
    }

    public void setup(){
        System.out.println("初始化方法调用了。。。");
    }

    public void destroy(){
        System.out.println("销毁方法调用了。。。");
    }

}
