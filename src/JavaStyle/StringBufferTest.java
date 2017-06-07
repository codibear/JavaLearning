package JavaStyle;

/**
 * Created by 29185 on 2017/5/23.
 */
public class StringBufferTest {
    public static void main(String [] args){
        StringBuffer sbf1 = new StringBuffer("Hello");
        sbf1.append("  world");
        System.out.println(sbf1);
    }
}
