package com.java.io;

import java.io.*;
import java.time.LocalDate;

/**
 * 对象的存储和序列化
 */
public class ObjectStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee2 harry = new Employee2("Harry Hacker", 50000, 1989, 10, 1);
        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        carl.setSecretary(harry);
        Manager tony = new Manager("Tony Tester", 40000, 1990, 3, 15);
        tony.setSecretary(harry);

        Employee2[] staff = new Employee2[3];
        staff[0] = carl;
        staff[1] = harry;
        staff[2] = tony;
        //将数据写入输出流
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\randomEmp.dat"))){
            out.writeObject(staff);
        }
        //将对象读入输入流
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\randomEmp.dat"))){
            Employee2[] newStaff = (Employee2[]) in.readObject();

            newStaff[1].raiseSalary(10);

            for (Employee2 e : newStaff){
                System.out.println(e);
            }
        }
    }
}

class Employee2 implements Serializable {
private String name;
private double salary;
private LocalDate hireDay;

public Employee2() {}

public Employee2(String name, double salary, int year, int month, int day)
        {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
        }

public String getName()
        {
        return name;
        }

public double getSalary()
        {
        return salary;
        }

public LocalDate getHireDay()
        {
        return hireDay;
        }


public void raiseSalary(double byPercent)
        {
        double raise = salary * byPercent / 100;
        salary += raise;
        }

@Override
public String toString()
        {
        return getClass().getName()
        + "[name=" + name
        + ",salary=" + salary
        + ",hireDay=" + hireDay
        + "]";
        }
        }
        class Manager extends Employee2{
        private Employee2 secretary;

            public Manager(String name, double salary, int year, int month, int day) {
                super(name, salary, year, month, day);
                this.secretary = null;
            }

            public void setSecretary(Employee2 secretary) {
                this.secretary = secretary;
            }

            @Override
            public String toString() {
                return super.toString() +
                        "secretary=" + secretary +
                        '}';
            }
        }
