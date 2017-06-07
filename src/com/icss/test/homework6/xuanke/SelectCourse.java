package com.icss.test.homework6.xuanke;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/5.
 */
public class SelectCourse {
    public static void main(String[] args) {
        while (true){
        System.out.println("请输入课程代号（1·3）之间的数字：");
        Scanner scanner = new Scanner(System.in);
        int flag =  scanner.nextInt();
        switch (flag){
            case 1:
                System.out.println("C#编程");
                break;
            case 2:
                System.out.println("数学");
                break;
            case 3:
                System.out.println("语文");
                break;
        }
        try {
            if (flag>3){
                throw new MyException("您输入的数字太大了！");
            }
        }catch (Exception e){

        }finally {
            System.out.println("欢迎提出建议！");
        }
    }}
}
