package Quiz3.test3.po;

/**
 * Created by 29185 on 2017/6/9.
 */
public class CustomList {
    private int id;
    private String name;
    private int num;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomList() {
    }

    public CustomList (int id ,String name, int num, double price) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
