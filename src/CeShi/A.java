package CeShi;

/**
 * Created by 29185 on 2017/6/21.
 */
public class A {
    //父子类的同名方法调用规则
    A(int i){}//这样的话子类不写会报错
    A(){}
    final public void a(){
        System.out.println("this is a");
    }
}
