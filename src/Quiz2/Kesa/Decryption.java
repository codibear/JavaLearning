package Quiz2.Kesa;

/**
 * Created by 29185 on 2017/6/2.
 */
public class Decryption {
    //将以转化的数组，进行解密
    public char[] out(char [] a){
        for (int i =0;i<a.length;i++){
            if((int)a[i]<123&&(int)a[i]>96){
                if((int)a[i]==(int)'a'){
                    a[i] = 'x';
                }else if((int)a[i]==(int)'b'){
                    a[i] = 'y';
                }else if((int)a[i]==(int)'c'){
                    a[i] = 'z';
                }else {
                    a[i] = (char)((int)a[i]-3);
                }
            }else {
                a[i] = a[i];
            }
        }
        return  a;
    }
}
