package com.ellden.spring.aop;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void save() {
        System.out.println("save....");
    }

    @Override
    public void delete() {
        System.out.println("delete....");
    }

    @Override
    public void add() {
        System.out.println("add....");
    }

    @Override
    public void select() {
        System.out.println("select....");
    }
}
