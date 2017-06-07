package JavaStyle;

/**
 * Created by 29185 on 2017/6/4.
 */
public class SuperTestSub extends SuperTest {
    SuperTestSub(int id ,String passwd,String name ){
        super(id,name,null);
    }
    SuperTestSub(){
        super.method();
    }

    public static void main(String[] args) {
        new SuperTestSub();
        new SuperTestSub(1,"sa","sa");
    }
}

