package com.icss.test.homework9.test1;

/**
 * Created by 29185 on 2017/6/8.
 */
public class Test extends Thread implements Runnable{
    Test(){}
    Test(String name){
        super(name);
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread("new Thread");
        Test test = new Test("main");
        Thread thread = new Thread(test);
        thread.start();
        myThread.start();

    }

    @Override
    public void run() {
        round();
    }

    public void round(){
        for (int i = 0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + "hello,world");
        }
    }
}
