package JavaStyle.Gen.Interface;

import org.jetbrains.annotations.NotNull;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Book implements Comparable<Book>{
    private String title;
    private double price;

    @Override
    public int compareTo(@NotNull Book o) {
        return 0;
    }

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
