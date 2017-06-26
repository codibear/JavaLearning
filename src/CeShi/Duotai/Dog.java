package CeShi.Duotai;

/**
 * Created by 29185 on 2017/6/22.
 */
public class Dog extends Animal{
    private String type;
    public void play(String str){
        System.out.println("玩："+str);
    }

    public static void main(String[] args) {
        //向下转型--向上转型
        Animal dog = new Dog();
        dog.eat("dongxi");
        //向下转型
        ((Dog)dog).play("飞盘");

        Dog dog1 = new Dog();
        //向上转型
        ((Animal)dog1).eat("屎");
    }
}
