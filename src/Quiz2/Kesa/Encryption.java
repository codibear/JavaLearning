package Quiz2.Kesa;

/**
 * Created by 29185 on 2017/6/2.
 */
public class Encryption {
    //将以转化的数组，进行加密
    public char[] out(char [] a){
        for (int i =0;i<a.length;i++){
            if((int)a[i]<123&&(int)a[i]>96){
                if((int)a[i]==120){
                    a[i] = 'a';
                }else if((int)a[i]==121){
                    a[i] = 'b';
                }else if((int)a[i]==122){
                    a[i] = 'c';
                }else {
                a[i] = (char)((int)a[i]+3);
                }
            }else {
                a[i] = a[i];
            }
        }
        return  a;
    }
}
