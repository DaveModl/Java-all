package com.java.object.emp;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("A君",75999,1992,11,12);
        staff[1] = new Employee("B君",23123,1990,6,4);
        staff[2] = new Employee("C君",12345,1991,12,8);

        for (Employee employee : staff){
            System.out.println(employee);
        }
    }
}

class Employee{
    /**
     * private 本类实例域
     */
    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * 构造器
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    /**
     * 封装：保证数据安全
     *
     */
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
/**
 * 1.this的用法:保证本类的一个对象
 * 2.表示隐式参数
 * 3.调用本类的其他构造器，必须在第一行
 * 获取或设置实例域的值
 * 1.一个私有的数据域
 * 2.共有域访问器getter
 * 3.共有的域更改器setter
 * 基于类的访问权权限：private method
 */