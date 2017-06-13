package CoreBook.Inheritance.EAM;

import java.time.LocalDate;

/**
 * Created by 29185 on 2017/6/11.
 */
public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, LocalDate hireDay) {
        super(name, salary, hireDay);
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}
