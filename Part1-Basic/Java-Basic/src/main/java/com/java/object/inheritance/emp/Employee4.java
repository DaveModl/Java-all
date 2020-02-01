package com.java.object.inheritance.emp;

import java.time.LocalDate;

public class Employee4 {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee4(String name, double salary,int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public Employee4(String name) {
        this.name = name;
        salary = 0.0;
        hireDay = LocalDate.now();
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
        this.salary += raise;
    }

    @Override
    public String toString() {
        return "Employee4{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
