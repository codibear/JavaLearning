package Quiz;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/24.
 * 求方程的根
 */
public class Quiz1 {
    private int a;
    private int b;
    private int c;
    private double x = 0;

    Quiz1(int a, int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Quiz1(){}
    public double analyzX1(){
        x = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        return x;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double analyzX2(){
        x = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        return x;
    }
    public void display(){
        double charge = b*b - 4*a*c;
        if(charge<0){
            System.out.println("无解");
        }else if(charge==0){
            System.out.println("x1=x2:"+analyzX1());
        }else {
            System.out.println("x1:"+analyzX1()+"  x2:"+analyzX2());
        }
    }
    public static void main(String [] args){
        Quiz1 quiz1 = new Quiz1();
        System.out.println("请输入 a b c:");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        quiz1.setA(a);
        quiz1.setB(b);
        quiz1.setC(c);
        quiz1.display();
    }
}
