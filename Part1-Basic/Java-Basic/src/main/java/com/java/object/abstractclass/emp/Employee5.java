package com.java.object.abstractclass.emp;

import com.java.object.abstractclass.Person;

import java.time.LocalDate;

public class Employee5 extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee5(String name,double salary,int year,int month,int day){
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
}
