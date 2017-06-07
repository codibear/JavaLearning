package com.icss.test.homework7.test4;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Country {
    private String name;
    private String id;
    Country(){}
    Country(String name,String id){
        this.name = name;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+"="+name;
    }
}
