package com.ellden.spring.ioc;

public class Car {
    public String carName ;
    public String price ;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
