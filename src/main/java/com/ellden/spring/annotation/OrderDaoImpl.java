package com.ellden.spring.annotation;


import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


public class OrderDaoImpl implements OrderDao {


    @Override
    public void save() {
        System.out.println("OrderDaoImpl save方法执行了。。。");
    }


}
