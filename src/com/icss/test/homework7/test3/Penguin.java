package com.icss.test.homework7.test3;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Penguin {
    private String name;
    private String size;

    Penguin(){}
    Penguin(String name,String size){
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static Penguin getInstance() {
        return new Penguin();
    }

    @Override
    public String toString() {
        return "企鹅名字："+name+"企鹅型号："+size;
    }
}
