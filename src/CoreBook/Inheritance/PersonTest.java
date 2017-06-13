package CoreBook.Inheritance;

import CoreBook.Inheritance.EAM.Employee;

import java.time.LocalDate;

/**
 * Created by 29185 on 2017/6/11.
 */
public class PersonTest {
    public static void main(String[] args) {
        //抽象类不是不能实例化么？
        Person person = new Person() {
            @Override
            public String getDescription() {
                return null;
            }
        };
        Person [] people = new Person[2];
        LocalDate localDate = LocalDate.of(1989,10,1);
        people[0] = new Employee("Harry Hacker",5000,localDate);

        people[1] = new Student("Maria Morris","Computer science");

        for (Person p :people) {
            System.out.println(p.getName()+","+p.getDescription());
        }
    }
}
