package JavaStyle;

/**
 * Created by 29185 on 2017/5/23.
 */
public class WrapperTest {
    public static void main(String [] args){
        char c ='c';
        Character character = new Character(c);
        System.out.println(Character.isDigit(c));

        int x = 10;
        Integer it = new Integer(x);//包装器
        int y = Integer.valueOf(x);//

        //自动装箱拆箱 装； 基本--》包装器 拆：包装器--》基本
        int m = 100;
        Integer itg = m;//装
        int n = itg; //拆
    }
}
