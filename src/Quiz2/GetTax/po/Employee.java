package Quiz2.GetTax.po;

/**
 * Created by 29185 on 2017/6/2.
 * 实体类员工
 */
public class Employee {
    private String name;
    private double salary;
    private double subsidy;
   public Employee(){}
   public Employee(String name ){
       this.name = name ;
   }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }
}
