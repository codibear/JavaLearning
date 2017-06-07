package Quiz2.Guess;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/2.
 */
public class GuessNum {
    public static void main(String[] args) {
        //生成随机数
        int number = (int)(Math.random()*100);
        boolean flag = true;
        //循环验证
        while (flag){
        System.out.println("我心里有一个0到99之间的整数，你猜是什么？");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>number){
            System.out.println("大了点，再猜！");
        }else if(num<number){
            System.out.println("小了点，再猜！");
        }else {
            System.out.println("猜对了！\n要努力啊！");
        }
    }
    }
}
