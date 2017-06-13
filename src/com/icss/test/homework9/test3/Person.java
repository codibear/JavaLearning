package com.icss.test.homework9.test3;

/**
 * Created by 29185 on 2017/6/8.
 * 通过set方法，在Account的方法里加入int num。数据
 */
public class Person extends Thread{
    private double num;
    private String personName;
    private Account account;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.fetch(this,num);
    }
}
