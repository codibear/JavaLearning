package CeShi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/20.
 */
public class test {
    public static void main(String[] args) {

        //继承
        //父子类的同名方法
        B b = new B();//前面的类型，不管是不是A或者B类他都会去先找子类方法（实体是B）//this is b
        b.a();



        /*
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。

	分析：
		A:数据是小于8位的整数
			数据是变化的。(不以0开头)
		B:加密规则
			假设数据为：123456

			首先将数据倒序
				654321
			然后将每位数字都加上5，再用和除以10的余数代替该数字
				109876
			最后将第一位和最后一位数字交换
				609871
		C:输出结果
			609871
			Scanner scanner = new Scanner(System.in);
        encryption(scanner);

*/

        //调用方法后是否会对引用的 参数产生影响-0---不会
        /*int a =1, b= 5;
        change(a,b);
        System.out.println("调用方法后：a："+a+"b:"+b);*/

        //数组
        //静态赋值
        /*int [] a = {1,2};
        int [] b = new int [] {5,3,7,9,1,5,4,7};
        //动态
        int [] c = new int [2];
        System.out.println("原来："+Arrays.toString(b));
        Arrays.sort(b);//自动从小到大排序
        System.out.println(Arrays.toString(b));
        for(int i = 0;i<b.length-1;i++){
            int temp=b[i];
            b[i]=b[i+1];
            b[i+1]=temp;
        }
        System.out.println("交换："+Arrays.toString(b));

        //数组的倒序--没有成功哦
        int a [] = new int []{5,8,9,4,2,7};
        for(int i = 0;i<a.length;i++){
            for (int j = a.length-2;j>i;j--){
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            System.out.println(Arrays.toString(a));
        }
        //老师给的方法
        public static void reverse(int[] arr) {
            for(int start=0,end=arr.length-1; start<=end; start++,end--) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        //冒泡排序---求最值
        //方法2.把第一个数组，定义为最大或者最小然后用一层循环去与其他的比较
        for(int j =0;j<b.length;j++){

            for(int i =0;i<b.length-j-1;i++){
                if(b[i]<b[i+1]){
                    //由大到小排列
                    int temp=b[i];
                    b[i]=b[i+1];
                    b[i+1]=temp;
                }

            } System.out.println(Arrays.toString(b));
        }
        System.out.println("最大值："+b[0]+"最小值："+b[b.length-1]);

        //二维数组---遍历
        int[] [] erwei= {{1,2,3},{4,5,6}};
        for(int i = 0 ;i<erwei.length;i++){
            System.out.println("first"+Arrays.toString(erwei[i]));
            for(int j = 0;j<erwei[i].length;j++){
                System.out.println(erwei[i][j]);
            }
        }
        //杨辉三角
        printTran(9);*/



        //自增自减的运用
        /*int a = 4;
        System.out.println(a++);//4
        System.out.println(a);//5
        System.out.println(++a);//6

        a=4;
        int b = (a++)+(++a)+(a*10);//70
        System.out.println("a:"+a+"b:"+b);*/

        //乘法表
        /*for (int i =1;i<10;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j+"\t");
            }
            System.out.println();
        }*/
        //四行五列的星星
        /*for (int i =0;i<5;i++){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* 请在控制台输出满足如下条件的五位数
        个位等于万位
        十位等于千位
        个位+十位+千位+万位=百位*/
        /*for(int i = 10000;i<100000;i++){
            int wang = i/10000;
            int qian = i%10000/1000;
            int bai = i%1000/100;
            int shi = i%100/10;
            int ge = i%10;

            if(ge==wang&&shi==qian&&ge+shi+qian+wang==bai){
                System.out.println(i);
            }
        }*/

        //请统计1-1000之间同时满足如下条件的数据有多少个：
        //对3整除余2对5整除余3对7整除余2
       /* for(int i = 0;i<=1000;i++){
            if(i%3==1&&i%5==3&&i%7==2){
                System.out.println(i);
            }
        }*/

        //奇数求和
        /*int sum = 0;
        for(int i = 0;i<=100;i++){
            if(i%2==1){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);*/

        //swich 探寻
       /* int a = 1;
        switch (a){
            case 1:
                System.out.println("1");
                return 0;//会报错，因为main方法不需要返回值
            case 2:
                System.out.println("2");

                default:
                    System.out.println("default");
        }*/

        //三目运算
        /*int x = 1,y=2;
        (x>2)?System.out.println("我是"):System.out.println("我是");*/

        //隐式类型转换可以从小到大自动转，即byte->short->int->long如果反过来会丢失精度，必须进行显示类型转换
        //short s=1 ;s = s+1;//短整型 = 整形 + 短整型---大的不能隐式转换成小的类型
        //short s=1 ; s+=1;//在解析时候s+=1就等价于s = (short)(s+1),翻番来讲就是


        /*除法
        System.out.println(5/1);//5
        System.out.println(5/1.0);//5.0  如果除数为小数，结果会自动转化为小数
        */
        //转换问题
       /* System.out.println('a');//a
        System.out.println('a'+1);//98

        System.out.println("hello"+'a'+1);//helloa1
        System.out.println('a'+1+"hello");//98hello
        System.out.println("5+5="+5+5);//5+5=55
        System.out.println(5+5+"=5+5");//10=5+5
        */
        /*byte b1=3,b2=4,b;
        b=b1+b2;//char、short、byte运算时会先转化int类型
        b=3+4;//据说是为了提高运算效率
        byte d =127;//长度为127～-128

        //byte a = 2; int i = a +3;//这样写就是对的因为最后输出的是int型的，小转大
        //byte a =3;byte = a+3;//这样写是错的，因为最后输出的是byte型，大转小，要用强制转换

        byte c = 300;*/
    }

    //swich方法探寻
    /*public static int fun(){
        int a = 1;
        switch (a){
            case 1:
                System.out.println("1");
                return 6;//在这里却是跳出
            case 2:
                System.out.println("2");

            default:
                System.out.println("default");
        }
        return a;
    }*/

    public static void chengBiao(int num){
        for(int i = 1;i<=num;i++){
            for(int j = 1 ;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }

            System.out.println();
        }
    }
    //打印杨辉三角
    public static void printTran(int num){
        for(int i = 0;i<num;i++){
            for (int j = num;j>i;j--){
                System.out.print(" ");
            }
            for(int z = 0 ;z <i;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void change(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+"-------"+b);
    }

    //解密游戏
    public static void encryption(Scanner in){
        System.out.println("请输入一个8位数的号码：");
        String  number= in.next();
        int tele [] = new int[6];
        if(number.trim().length()<=6){
            for(int i = 0 ;i<number.length();i++){
                //tele[i]=(number.charAt(i)+5+number.charAt(i))%10;
                tele[i]=number.charAt(i)-48;
            }
             System.out.println("转换到数组"+Arrays.toString(tele));
            //先倒序
            for(int i = 0,j=tele.length-1 ;i<tele.length;i++,j--){
               if(i<j){
                int temp = tele[i];
                tele[i]=tele[j];
                tele[j]=temp;}
            }
            System.out.println("倒序:"+Arrays.toString(tele));
            for(int i = 0 ;i<number.length();i++){
                tele[i]=(tele[i]+5)%10;
            }
            int temp =tele[0];
            tele[0]=tele[tele.length-1];
            tele[tele.length-1]=temp;
            System.out.println(Arrays.toString(tele));
        }else {
            System.out.println("您输入的位数不对");
        }
    }

}
