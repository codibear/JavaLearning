package BookClient.po;

import java.io.Serializable;

/**
 * Created by 29185 on 2017/6/12.
 */
public class Book implements Serializable{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + id;
    }
}
