package com.icss.test.homework2;

/**
 * Created by 29185 on 2017/5/23.
 */
class Student{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;

    Student(){}
    Student(String name,int age,String address,String zipCode,String mobile){
        this.name = name;
        this.age = age;
        this.zipCode = zipCode;
        this.address = address;
        this.mobile = mobile;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getZipCode() {
        return zipCode;
    }
    public String getPostAddress(){
        return address+zipCode;
    }
}