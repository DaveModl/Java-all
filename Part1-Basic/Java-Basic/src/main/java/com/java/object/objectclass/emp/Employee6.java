package com.java.object.objectclass.emp;

import java.time.LocalDate;
import java.util.Objects;

public class Employee6 {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee6(String name,double salary,int year,int month,int day){
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
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    @Override
    public boolean equals(Object otherE){
        if(this == otherE){
            return true;
        }

        if (otherE == null){
            return false;
        }

        if (getClass() != otherE.getClass()){
            return false;
        }

        Employee6 employee = (Employee6) otherE;

        return Objects.equals(name,((Employee6) otherE).name)
                && salary == ((Employee6) otherE).salary
                && Objects.equals(hireDay,((Employee6) otherE).hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return "Employee6{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
