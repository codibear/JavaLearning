package JavaStyle;


/**
 * Created by 29185 on 2017/5/22.
 */
public class Student {
    private String name;
    private int age;
    private PersonalAccount account;//引用类型

    /**
     * 新内容关联关系！！！
     * @param name
     * @param age
     * 一个学生要有个个人账户
     */

    private PersonalAccount personalAccount;


    public Student (String name ,int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return  age;
    }

    //缴纳学费
    public void pay (double amount){
        return  ;
    }


    //返回银行卡信息
    public PersonalAccount getAccount(){
        return account;
    }
    //设置银行卡
    public void setAccount(PersonalAccount account){
        this.account = account;
    }
    public static void main(String [] args){
        //引用类型赋值
        Student stu1 = new Student("zhangsan",11);
        Student stu2 = new Student("zhangsan",11);
        System.out.println("stu1.age="+stu1.getAge()+"stu2.age="+stu2.getAge());
        stu1.setAge(18);
        System.out.println("stu1.age="+stu1.getAge()+"stu2.age="+stu2.getAge());

        //两者地址相同了，一改全改
        stu1 = stu2;
        System.out.println("stu1.age="+stu1.getAge()+"stu2.age="+stu2.getAge());

        stu1.setAge(1000);
        System.out.println("stu1.age="+stu1.getAge()+"stu2.age="+stu2.getAge());
        stu2.setAge(10000);
        System.out.println("stu1.age="+stu1.getAge()+"stu2.age="+stu2.getAge());
        //修改年龄
        Student student = new Student("jason",18);
        PersonalAccount account = new PersonalAccount("99555","123",1000);



    }
}
