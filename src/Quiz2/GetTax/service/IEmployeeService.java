package Quiz2.GetTax.service;

import Quiz2.GetTax.po.Employee;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/2.
 */
public interface IEmployeeService {
    //获得数据
    public abstract void getTax(Employee employee, Scanner input);
    //计算方法
    public abstract void getAfter(Employee employee);
    //姓名验证
    public abstract boolean login(Employee [] employees, String name);
}
