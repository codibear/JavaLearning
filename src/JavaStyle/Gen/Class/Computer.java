package JavaStyle.Gen.Class;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Computer {
    private String type;
    private double price;
    Computer(String type,double price){
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return price+type;
    }
}
