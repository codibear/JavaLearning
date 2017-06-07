package com.icss.test.homework4.salecar;

/**
 * Created by 29185 on 2017/5/25.
 */
public class Saler {
    private String name;
    Saler(){}
    Saler(String name){
        this.name = name;
    }
    public void typeOne(int num){
        Car car = new Car(num);
        System.out.println(this.name+"销售出"+car.getNum()+"辆汽车");
    }
    public void typeTwo(String type,int num){
        Car car = new Car(type,num);
        System.out.println(this.name+"销售出"+car.getNum()+"辆"+car.getType()+"汽车");
    }
}
