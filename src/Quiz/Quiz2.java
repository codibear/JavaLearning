package Quiz;

/**
 * Created by 29185 on 2017/5/24.
 * 求一个三位数，该三位数等与其每位数字的阶乘之和
 */
public class Quiz2 {
    public static void main(String [] args){
        sum();
    }
    public static void sum(){

       for(int x = 100;x<1000;x++) {
           int bai = x / 100;
           int shi = x % 100 / 10;
           int ge = x % 10;
           int sumbai = shu(bai);
           int sumshi = shu(shi);
           int sumge = shu(ge);
           int flag = sumbai+sumge+sumshi;
           if (x == flag){
               System.out.println(x);
           }
       }
    }

    public static int shu(int shu){
        int add = 1;
        for( int i=1;i<=shu;i++)
        {
            add*=i;
        }
        return add;
    }
}
