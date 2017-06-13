package com.icss.test.homework9.test2;

/**
 * Created by 29185 on 2017/6/8.
 */
public class Test{
    public static void main(String[] args) {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1;i<11;i++){
                    System.out.println(Thread.currentThread().getName()+"\t"+i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "A");
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 10;i>0;i--){
                    System.out.println(Thread.currentThread().getName()+"\t"+i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "B");

        A.start();
        B.start();

    }

}
