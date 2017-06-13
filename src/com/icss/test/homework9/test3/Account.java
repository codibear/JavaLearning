package com.icss.test.homework9.test3;

/**
 * Created by 29185 on 2017/6/8.
 */
public class Account {
    private static double money = 10000;

    public static void setMoney(double money) {
        Account.money -= money;
    }

    public static double getMoney() {
        return money;
    }

    public synchronized void fetch(Person person, double num){
        //
        if(num>money){
            try {
                System.out.println("余额不足以支付"+person.getPersonName()+"  的取款    "+"余额为"+money);
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(person.getPersonName()+"\t"+"准备取款！"  );
        Account.setMoney(num);
        System.out.println(person.getPersonName()+"\t"+"完成取款！");
        this.notifyAll();
    }

}
