package Quiz2.GetTax.service;

import Quiz2.GetTax.po.Employee;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/2.
 * 员工类接口的实现
 */
public class EmployeeImpl implements IEmployeeService{
    //查找姓名的验证
    @Override
    public boolean login(Employee [] employee, String name) {
        boolean flag = true;
        for (Employee e : employee) {
            if (e.getName().equals(name)) {
                flag = false;
            }
        }
        if(flag==true)
            System.out.println("您输入的员工名字不存在，请重新输入!!");
        return flag;
    }
    //员工工资的获取方法
    @Override
    public void getTax(Employee employee, Scanner input) {
        System.out.println("请输入员工工资：");
        employee.setSalary(input.nextDouble());
        System.out.println("请输入员工加班补贴：");
        employee.setSubsidy(input.nextDouble());
    }
    //计算所得税以及其他数据的方法
    @Override
    public void getAfter(Employee employee) {
        double sbsidy = employee.getSubsidy();
        double salary = employee.getSalary();
        double before = salary+sbsidy;
        //应缴税额
        double sholdeTax;
        //税后收入
        double after ;
        //所交税
        double getTax;
        //税前收入

        System.out.println("您的税前收入为"+before+"元，");
        if (before<2000){
            System.out.println("您不需要纳税！");
            System.out.println("收入为："+before+"元");
        }else{
            if(before<2500){
              sholdeTax = before - 2000;
              getTax = sholdeTax*0.05;
              after = before - getTax;
            }else if(before<4000){
                sholdeTax = before - 2000;
                getTax = sholdeTax*0.1;
                after = before - getTax;
            }else if(before<7000){
                sholdeTax = before - 2000;
                getTax = sholdeTax*0.15;
                after = before - getTax;
            }else if(before<22000){
                sholdeTax = before - 2000;
                getTax = sholdeTax*0.20;
                after = before - getTax;
            }else {
                sholdeTax = before - 2000;
                getTax = sholdeTax*0.30;
                after = before - getTax;
            }
            System.out.println("税后收入为："+after+"元,"+"您交纳的个人所得税："+getTax+"元。");
        }

    }
}
