package com.icss.test.homework4.pet;

/**
 * Created by 29185 on 2017/5/25.
 */
public class Dog {
    private String name;
    private double health;
    private double close;
    private String type;

    Dog(){}
    Dog(String name,double health,double close,String type){
        this.name = name;
        this.health = health;
        this.close = close;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getClose() {
        return close;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void display(){
        System.out.println("您养的是"+type+"狗"+"昵称："+name+"健康值："+health+"亲密度："+close);
    }
}
