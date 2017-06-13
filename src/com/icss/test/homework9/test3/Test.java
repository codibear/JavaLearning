package com.icss.test.homework9.test3;

/**
 * Created by 29185 on 2017/6/8.
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        for(int i = 0;i<4;i++)
        {
            Person person = new Person();
            person.setPersonName("张三");
            person.setAccount(account);
            person.setNum(2000);
            Person person1 = new Person();
            person1.setPersonName("张三的媳妇");
            person1.setAccount(account);
            person1.setNum(2000);
            person.start();
            person1.start();
        }
    }
}
