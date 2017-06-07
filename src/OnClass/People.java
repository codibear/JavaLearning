package OnClass;

/**
 * Created by 29185 on 2017/5/23.
 */
public class People {
    int age;
    char sex;
    int height;
    String name;
    public People(){}
    public People(String name){
        this.name = name;
    }
    public People(int age,char sex,int height,String name){
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void speak(String saySomething){
        System.out.println("您说了"+saySomething);
    }
    public void setName(String name){
        this.name = name;
    }
    public static void a(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String [] args){
        People people = new People(12,'男',180,"里狗蛋");
        People people1 = new People("王尼玛");
        System.out.println( people.getName());
        System.out.println( people1.getName());
     /*  people.name = "张三";
        people.age = 18;
        people.sex = '男';
        people.height = 180;
        people.speak("你好");
        People.a(24,5);
        people.setName("李四");
        System.out.println(people.name);
        */
    }
}
