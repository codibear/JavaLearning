package OnClass.ListTest;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Student {
    private String name ;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    //重写toString 方法，让其能正常输出

    @Override
    public String toString() {
        return name+id;
    }
}
