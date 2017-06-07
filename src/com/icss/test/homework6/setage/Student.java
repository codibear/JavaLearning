package com.icss.test.homework6.setage;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws Exception {
        this.age = age;
        if(age>100||age<1){
            throw new Exception("年龄必须在1-100之间");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
