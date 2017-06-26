package CeShi;

/**
 * Created by 29185 on 2017/6/21.
 */
public class B extends A {
    B(int i) {
        super(i);
    }
    B(){}
    final public void b(){
        System.out.println("this is b");
    }
     /*public void a(){

    }*/
    public void b(int a){

    }

    public static void main(String[] args) {
        A a = new B();
    }
}
