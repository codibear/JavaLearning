package OnClass.accesssright;

/**
 * Created by 29185 on 2017/5/31.
 */
public class A {
    private String name;
    private String id;
    protected String test;
     String  def;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    //私有权限修饰符，只能在本类中访问
    public static void main(String[] args) {
        A a = new A();
        a.name = "xiba";
        a.getName();
        //default 包内友好
        a.def = "da";
    }
}
