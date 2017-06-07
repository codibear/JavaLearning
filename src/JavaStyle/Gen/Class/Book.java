package JavaStyle.Gen.Class;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Book {
    private String title;
    private double price;

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title+price;
    }
}
