package com.ellden.spring.ioc;

public class CarInfo {
    public String name ;
    public String price ;

    public String getName() {
        return "摩托车";
    }
    public String cacu(){
        return  ""+Math.random()*1000;
    }
}
