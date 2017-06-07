package com.icss.test.homework2;

/**
 * Created by 29185 on 2017/5/23.
 */
public class Number {
    private int n1;
    private int n2;
    Number(){}
    Number(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public int addition(){
        return n1 + n2;
    }
    public int subtration(){
        return n1 - n2;
    }
    public int multiplication(){
        return n1*n2;
    }
    public int division(){
        if(n2==0){
            System.out.println("Wrong!");
            return 0;
        }else {
            return n1/n2;
        }
    }
    public static void main(String [] args){
        Number number = new Number(50,3);
        System.out.println("加法："+number.addition()+"减法："+number.subtration()+"乘法："+
                number.multiplication()+"除法："+number.division());
    }
}
