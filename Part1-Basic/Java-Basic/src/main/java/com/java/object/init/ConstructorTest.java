package com.java.object.init;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee3[] staff = new Employee3[3];

        staff[0] = new Employee3("A",50000);
        staff[1] = new Employee3(35000);
        staff[2] = new Employee3();

        for (Employee3 employee : staff){
            System.out.println(employee);
        }
    }
}
class Employee3{
    private static int nextId;
    private int id;
    /**实例域初始化*/
    private String name = "";
    private double salary;

    /**
     * 静态初始化块
     */
    static {
        Random generator = new Random();
        //初始化生成一个0-9999的随机数
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee3(double salary) {
        //调用其他构造器
        this("Employee #"+ nextId,salary);
    }

    /**
     * 默认构造器
     */
    public Employee3(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
