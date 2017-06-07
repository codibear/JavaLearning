package Test;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/6.
 */
public class A {
    public static void main(String [] args){
        System.out.println("************消费单*************");
        System.out.println("+---------+--------+--------+--------+");
        System.out.println("|购买商品\t|单价\t|个数\t|金额\t|");
        System.out.println("+---------+--------+--------+--------+");
        System.out.println("1.T恤\t\t\t￥246\t2\t\t￥490");
        System.out.println("2.网球鞋\t\t￥570\t1\t\t￥570");
        System.out.println("3.网球拍\t\t￥320\t1\t\t￥320");
        System.out.println();
        System.out.println("折扣：\t\t8折");
        System.out.println("消费总金额：\t\t￥1104.0");
        System.out.println("实际缴费：\t\t\t￥1500.0");
        System.out.println("找钱：\t\t\t\t￥396.0");
        System.out.println("本次购物所获积分是：33");

        Scanner input = new Scanner(System.in);
        int flag = input.nextInt();
        if (flag==1){
            System.out.println("T is your favourite!");
        }else if(flag==2){
            System.out.println("shoes is your favourite!");
        }else {
            System.out.println("paddle is your favourite!");
        }
        String a =input.next();
        System.out.println(a);
    }
}
