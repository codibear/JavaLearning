package mianxiangduixiang;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Feeder {
    private String name;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void feed(Animal animal,Food food){
        System.out.println("喂"+animal.getName()+"吃"+food.getName());
    }
}
