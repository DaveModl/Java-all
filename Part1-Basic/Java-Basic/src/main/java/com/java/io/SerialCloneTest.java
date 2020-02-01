package com.java.io;

import java.io.*;
import java.time.LocalDate;

public class SerialCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee3 harry = new Employee3("Harry",35000,1989,10,1);

        Employee3 harryClone = (Employee3) harry.clone();

        harry.raiseSalary(10);
        System.out.println(harry);
        System.out.println(harryClone);
    }
}

class SerialCloneable implements Cloneable, Serializable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            //保存对象到字节输出流
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            try(ObjectOutputStream out = new ObjectOutputStream(bout)){
                out.writeObject(this);
            }
            //保存克隆对象到字节输出流
            try(InputStream bin = new ByteArrayInputStream(bout.toByteArray())){
                ObjectInputStream in = new ObjectInputStream(bin);
                return in.readObject();
            }
            }catch (IOException | ClassNotFoundException e) {
            CloneNotSupportedException e2 = new CloneNotSupportedException();
            e2.initCause(e);
            throw e2;
        }
    }
}

class Employee3 extends SerialCloneable{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee3(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
