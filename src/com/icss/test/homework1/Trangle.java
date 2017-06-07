package com.icss.test.homework1;

/**
 * Created by 29185 on 2017/5/22.
 * 杨辉三角
 */
public class Trangle {
    public static void main(String  [] args){
        for(int i=10;i>0;i--){ //一共几行
            for(int j=0;i-j>0;j++){//前面的几个空格
                System.out.print(" ");
            }
            for(int z=i;z<=10;z++){//每一行几个星
                System.out.print("* ");
            }
            System.out.println();//每一行换行
        }
    }
}
