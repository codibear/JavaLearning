package OnClass;

/**
 * Created by 29185 on 2017/5/22.
 */

import java.util.Arrays;

/**
 * @author zhangzhixiong
 */
public class FirstLessonSum {
    public static void main(String [] args){
        System.out.println("\"项目\t\t名称\t\t年龄\\ \"");
        /*基本数据类型:byte short int long float double char boolean;
                        8   16    32    64   64    32      16      1*/
        byte a =1;
        //自动转换  小-》大
        int b = a;
        //强制转换  大-》小
        char c = (char)b;
        //引用类型引用在栈中，他的数据在堆中，所以用==号比较字符会出现不匹配的现象，
        // 因为比较的是引用的地址，而不是他自己的值，此时应该用equal；

        //而基本类型的值都在栈中所以可以用==来进行比较。
        String name = "aaa";
        String pwd = "1";
        if(name.equals("aaa") & pwd.equals( "123")){
            System.out.println("只执行了第一句");
        }else{
            System.out.println("都执行了！");
        }
        if(name.equals("aaa") | pwd.equals( "123")){
            System.out.println("只执行了第一句");
        }else{
            System.out.println("都执行了！");
        }
        //数组
        String  [] arrays = new String [3];
        arrays[1] = "sss";
        arrays[2] = "kkk";
        for (String i : arrays
                ) {
            System.out.println(i);
        }

        String  [] array = {"aaa","bbb","ccc"};
        for (String i : array
             ) {
            System.out.println(i);
        }
        System.out.println("这是直接输出："+ Arrays.toString(array));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
