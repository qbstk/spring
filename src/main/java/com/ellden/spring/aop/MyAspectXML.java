package com.ellden.spring.aop;

/**
 * 切面类
 */
public class MyAspectXML {
    public void checkPri(){
        System.out.println("切面检查权限。。。。");
    }

    public void checklog(){
        System.out.println("切面检查日志。。。。");
    }
}
