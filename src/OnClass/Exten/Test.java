package OnClass.Exten;

/**
 * Created by 29185 on 2017/5/31.
 */
public class Test {
    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(10,10,20,10);
        System.out.println("周长是："+plainRect.perimeter());
        System.out.println("面积是："+plainRect.area());
        boolean flag= plainRect.isInside(25.5,13);
        if(flag=true){
            System.out.println("在矩形里面！");
        }else {
            System.out.println("不在矩形里面！");
        }
    }
}
