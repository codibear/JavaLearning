package com.icss.test.homework2;

/**
 * Created by 29185 on 2017/5/23.
 */
public class OneClass {
    private int some1;
    private String someName;
    private double someNumber;
    OneClass(){}
    OneClass(int some1,String someName,double someNumber){
        this.some1 = some1;
        this.someName = someName;
        this.someNumber = someNumber;
    }

    public double getSomeNumber() {
        return someNumber;
    }

    public int getSome1() {
        return some1;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSome1(int some1) {
        this.some1 = some1;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public void setSomeNumber(double someNumber) {
        this.someNumber = someNumber;
    }
}
