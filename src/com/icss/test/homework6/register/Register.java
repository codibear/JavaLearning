package com.icss.test.homework6.register;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Register {
    public void verify(String name,String password,String rePassword){
        StringBuffer stringBuffer = new StringBuffer();
        if(name.length()<3){
            stringBuffer.append("用户名的长度不能小于3");
        }
        if(password.length()<6){
            stringBuffer.append("密码长度不能小于6！");
        }
        if(!password.equals(rePassword)){
            stringBuffer.append("两次输入的密码不相同！");
        }
        if(password.equals(rePassword) && password.length()>5 && name.length()>2){
            System.out.println("注册成功！请牢记用户名和密码。");
        }
        System.out.println(stringBuffer);
}

    public static void main(String[] args) {
        System.out.println("*****************欢迎进入注册系统******************");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("请输入用户名：");
            String name = input.next();
            System.out.println("请输入密码：");
            String password = input.next();
            System.out.println("请再次输入密码：");
            String rePassword = input.next();
            Register register = new Register();
            register.verify(name,password,rePassword);
        }
    }
}
