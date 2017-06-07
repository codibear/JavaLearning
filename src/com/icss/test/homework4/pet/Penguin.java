package com.icss.test.homework4.pet;

/**
 * Created by 29185 on 2017/5/25.
 */
public class Penguin {
    private String name;
    private double health;
    private double close;
    private String sex;

    Penguin(){}
    Penguin(String name,double health,double close,String sex){
        this.name = name;
        this.health = health;
        this.close = close;
        this.sex = sex;
    }

    public void display(){
        System.out.println("您养的是"+sex+"企鹅"+"昵称："+name+"健康值："+health+"亲密度："+close);
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getClose() {
        return close;
    }

    public String getSex() {
        return sex;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
