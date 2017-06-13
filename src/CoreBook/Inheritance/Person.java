package CoreBook.Inheritance;

/**
 * Created by 29185 on 2017/6/11.
 */
public abstract class Person {
    private String name;
    protected int id;
    public Person(String name){
        this.name = name;
    }

    public Person() {

    }

    public abstract String getDescription();
    public String getName(){
        return name;
    }
}
