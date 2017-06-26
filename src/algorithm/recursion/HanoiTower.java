package algorithm.recursion;

/**
 * Created by 29185 on 2017/6/20.
 */
public class HanoiTower {
    public static void main(String[] args) {
        fun('a','b','c',3);
    }
    public static void fun(char begin,char temp,char end,int num){
        //如果想下面这样写，形参就没有意义，最后只会出现a-----c
    /*    if(num==1){
            System.out.println("A----------C");
        }else {
            //一开始，把A中的n-1个从A借助C移动到B
            fun('a','c','b',num-1);
            //然后把A中最下面的移动到C
            System.out.println("A------->C");
            //最后把剩下的n-1个从A借助B移动到C
            fun('a','b','c',num-1);
        }*/
        if(num==1){
            System.out.println(begin+"------>"+end);
        }else {
            //一开始，把A中的n-1个从A借助C移动到B
            fun(begin,end,temp,num-1);
            //然后把A中最下面的移动到C
            System.out.println(begin+"------->"+end);
            //最后把剩下的n-1个从B借助A移动到C
            fun(temp,begin,end,num-1);
        }
    }
}
