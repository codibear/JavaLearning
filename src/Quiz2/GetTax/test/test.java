package Quiz2.GetTax.test;

import Quiz2.GetTax.po.Employee;
import Quiz2.GetTax.service.EmployeeImpl;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/2.
 * 测试类
 */
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee [] employees = new Employee[3];
        //数组初始化
        employees[0] = new Employee("李刚");
        employees[1] = new Employee("张帅");
        employees[2] = new Employee("王五");
        Employee employee = new Employee();
        EmployeeImpl e = new EmployeeImpl();
        boolean check = true;
        //循环验证
        while (check){
        System.out.println("请输入员工的姓名：");
        String name = input.next();
        boolean flag =  e.login(employees,name);
        if (flag){
            check = true;
        }else {
            check = false;
            employee.setName(name);
        }
        }
        //获得数据
        e.getTax(employee,input);
        //计算所得税
        e.getAfter(employee);
    }
}
