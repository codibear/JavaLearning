package Quiz2.Num;

/**
 * Created by 29185 on 2017/6/2.
 */
public class ShuLie {
    public static void main(String[] args) {
        int [] a = new int[12];
        a[0] = 1;
        a[1] = 1;
        for(int i =0;i<10;i++){
            a[i+2] = a[i+1]+a[i];
        }
        for (int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}
