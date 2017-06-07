package OnClass;

/**
 * Created by 29185 on 2017/5/23.
 */
public class ClassTest1 {
    int age ;
    String name;
    String sex;

    public void eat(String food,int time){
        System.out.println("您今天吃的是："+food);
        System.out.println("所用时间："+time);
    }

    public static void main(String [] args){
        ClassTest1 classTest1 = new ClassTest1();
        classTest1.age = 5;
        classTest1.name = "张志雄";
        classTest1.sex = "男";
        classTest1.eat("包子",5);
    }
}
