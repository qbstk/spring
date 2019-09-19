package com.ellden.spring.ioc;

public class UserDaoJdbcImpl implements UserDao {
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String userName ;


    @Override
    public void save() {
        System.out.println("save jdbc impl..."+userName);
    }
}
