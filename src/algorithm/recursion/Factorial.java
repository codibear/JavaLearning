package algorithm.recursion;

/**
 * Created by 29185 on 2017/6/20.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int a){
        if(a==0){//添加的出口
            return 1;
        }
        return a*factorial(a-1);//直接写这句，会一直循环，因为没有出口
    }
}
