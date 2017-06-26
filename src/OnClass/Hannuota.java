package OnClass;

/**
 * Created by 29185 on 2017/5/24.
 */
public class Hannuota {
    public static void main(String  [] args){
        train(3,'A','B','C');
    }
    public static void train(int n,char from,char temp,char to){
        if(n==1){//为什么去验证这个1-----归的思想，一定要出去，否则的话就该陷入无限循环中
            System.out.println(from +"-------->"+to);
        }else {
            //n-1个（上层的）从A到B借助C
            train(n - 1, from, to, temp);
            //把最底下的从A移动到C
            System.out.println(from + "-------->" + to);
            //把剩下的从B移动到C借助A
            train(n - 1, temp, from, to);
        }
    }
}
   /*  System.out.println("第" + (++m) +" 次移动 : " +" 把 "+ disks+" 号圆盘从 " + N +" ->移到->  " + M);
}
    //递归实现汉诺塔的函数
    public static void hanoi(int n,char A,char B,char C)
    {
        if(n == 1)//圆盘只有一个时，只需将其从A塔移到C塔
            TowersOfHanoi.move(1, A, C);//将编b号为1的圆盘从A移到C
        else
        {//否则
            hanoi(n - 1, A, C, B);//递归，把A塔上编号1~n-1的圆盘移到B上，以C为辅助塔
            TowersOfHanoi.move(n, A, C);//把A塔上编号为n的圆盘移到C上
            hanoi(n - 1, B, A, C);//递归，把B塔上编号1~n-1的圆盘移到C上，以A为辅助塔*/

