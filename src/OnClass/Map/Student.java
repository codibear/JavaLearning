package OnClass.Map;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Student {
    private String name;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + id;
    }
}
