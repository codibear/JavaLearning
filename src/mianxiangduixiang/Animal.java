package mianxiangduixiang;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(Food food){
        System.out.println("吃"+food.getName());
    }
}
