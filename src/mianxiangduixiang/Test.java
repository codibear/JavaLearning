package mianxiangduixiang;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Test {

    public static void main(String[] args) {
        //多态的实现，以及面向对象的思想
        Animal dog = new Dog();
        dog.setName("旺旺");
        Animal cat = new Cat();
        cat.setName("猫咪");

        Food fish = new Fish();
        fish.setName("鲨鱼");
        Food bone = new Bone();
        bone.setName("冬天的骨头");
        //----------------------------------------------------------------
        Feeder feeder = new Feeder();
        feeder.setName("叼炸天");
        feeder.setBalance(1000);
        //思想：那个对象怎么做就需要传递什么参数。
        feeder.feed(dog,bone);
        feeder.feed(cat,fish);

    }
}
