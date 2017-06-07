package JavaStyle.Gen.method;

import JavaStyle.Gen.Class.Book;

/**
 * Created by 29185 on 2017/6/7.
 */
public class TestGanMethod {
    public static  <T> T  getX(T x){
        return x;
    }

    public static void main(String[] args) {
        System.out.println(TestGanMethod.getX("hello"));
        System.out.println(TestGanMethod.getX(new Book("java",23)));
    }
}
