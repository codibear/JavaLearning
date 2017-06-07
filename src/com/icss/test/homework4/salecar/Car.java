package com.icss.test.homework4.salecar;

/**
 * Created by 29185 on 2017/5/25.
 */
public class Car {
    private int id;
    private String type ;
    private int num;
    Car(){}
    Car(int num){
        this.num = num;
    }
    Car(String type,int num){
        if(type.equals("君威")||type.equals("凯越")){
        this.type = type;
        this.num = num;}else {
            System.out.println("没有此车型");
        }
    }
    public int getId() {
        return id;
    }

    public int getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
