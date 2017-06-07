package Quiz2.Kesa;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/2.
 */
public class Switcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请选择操作：1.加密\t2.解密");
        int check = in.nextInt();
        String name;
        switch (check){
            case 1:
                System.out.println("请输入待加密的字符串：");
                name = in.next();
                Encryption encryption = new Encryption();
                char[] a = encryption.out(input(name));
                System.out.println("加密后的字符串是：");
                for (char i:a) {
                    System.out.print(i);
                }
                break;
            case 2:
                System.out.println("请输入待解密的字符串：");
                name = in.next();
                Decryption decryption = new Decryption();
                char[] b = decryption.out(input(name));
                System.out.println("加密后的字符串是：");
                for (char i:b) {
                    System.out.print(i);
                }
                break;
        }
    }

    public static char[] input(String name){
        char [] contanier = new char[name.length()];
        for(int i = 0;i<name.length();i++){
            contanier[i] = name.charAt(i) ;
        }
        return contanier;
    }
}
