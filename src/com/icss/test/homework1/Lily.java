package com.icss.test.homework1;

/**
 * Created by 29185 on 2017/5/22.
 */
public class Lily {
    public static void main(String  [] args){

       for(int a = 100;a<1000;a++) {
        int x = a/100;                      //百位
        int y = a%100/10;
        int z = a%10;
        if(x*x*x+y*y*y+z*z*z==a){
            System.out.println(a);
        }
       }

    }
}
