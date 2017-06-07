package OnClass.accessright2;

import OnClass.accesssright.A;

/**
 * Created by 29185 on 2017/5/31.
 */
public class B extends A {
    public static void main(String[] args) {
        //public都能用
        A a = new A();
        a.setId("ss");
        //protect包内友好、父子友好
       /* a.test = "aa";*///错误
        B b = new B();
        b.test = "aaa";
        //default 包内友好，父子不友好
        /*b.def ="aaa";*/
    }
}
