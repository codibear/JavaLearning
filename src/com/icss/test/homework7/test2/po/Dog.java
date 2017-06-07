package com.icss.test.homework7.test2.po;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Dog {
    private String name;
    private String type;

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
        return name+"\t"+type;
    }
}
