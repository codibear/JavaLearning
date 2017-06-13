package com.icss.test.homework8.test3.po;

import java.io.Serializable;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Goods implements Serializable{
    private String name;
    private int id;
    private int num;
    private double price;
    public Goods(){}

    public Goods(String name, int id, int num, double price) {
        this.name = name;
        this.id = id;
        this.num = num;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setId(int id) {
        this.id = id;
    }
}
