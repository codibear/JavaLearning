package com.icss.test.homework7.test5.po;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Pet {
    private String name;
    private String type;

    public Pet(){}
    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "宠物名："+name+"宠物种类："+type;
    }
}
