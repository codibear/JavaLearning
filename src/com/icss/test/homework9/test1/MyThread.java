package com.icss.test.homework9.test1;

/**
 * Created by 29185 on 2017/6/8.
 */
public class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"\t"+"hello,world");
        }
    }
}
