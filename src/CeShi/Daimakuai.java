package CeShi;

/**
 * Created by 29185 on 2017/6/21.
 */
public class Daimakuai {
    Daimakuai(){
        System.out.println("gouzao");
    }
    {
        System.out.println("普通");
    }
    static {
        System.out.println("静态");
    }

    public static void main(String[] args) {
        new Daimakuai();
    }
}
