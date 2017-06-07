package JavaStyle;

/**
 * Created by 29185 on 2017/5/23.
 */
public class StringTest1 {
    public static void main(String [] args){
        //正常写法
        String str1 = new String ("etc");
        String str11 = new String("etc");
        //String 地特殊之处,可以直接赋值,在字符串池中寻找是否有，有就不再创建
        String str2 = "etc";
        String str22 = "etc";
        //是否在同一位置
        System.out.println(str1==str11);
        System.out.println(str2==str22);
        System.out.println(str1==str2);

        if(str1=="etc"){
            System.out.println("s1 is etc");
        }else{
            System.out.println("s1 is not etc");
        }
        //使用equal
        if(str1.equals("etc")){
            System.out.println("s1 is etc");
        }else{
            System.out.println("s1 is not etc");
        }
        if(str2=="etc"){
            System.out.println("s2 is etc");
        }else{
            System.out.println("s2 is not etc");
        }
    }
}
