package CoreBook.Inheritance.EAM;

import CoreBook.Inheritance.Person;

import java.time.LocalDate;

/**
 * Created by 29185 on 2017/6/11.
 */
public class Employee extends Person{
    private String name;
    private double salary;
    private LocalDate hireDay;
    //添加的
    @Override
    public String getDescription() {
        return String.format("an emmployee with a salary of $%.2f",salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public Employee(String name, double salary, LocalDate hireDay) {
        super();
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }
}
