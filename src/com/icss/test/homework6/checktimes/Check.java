package com.icss.test.homework6.checktimes;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Check {
    static int count=0;
    public void check(Scanner input){
        System.out.println("请输入一个字符串：");
        String string = new String(input.next());
        System.out.println("请输入查找的字符：");
        String str = input.next();
        sub(string,str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        check.check(scanner);
        System.out.println(count);
    }
    public void sub(String string,String str){
        int i=0;
        i = string.indexOf(str);
        boolean flag  = true;
        while (i!=-1&&flag==true){
            if(string==""){
                flag = false;
            }
                i = string.indexOf(str);
                if(i==-1)
                    break;
                count++;
                i++;
                string = string.substring(i);
        }
    }
}
