package com.java.object.interfaces.clones;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee8 implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee8(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    @Override
    public Employee8 clone() throws CloneNotSupportedException {
        Employee8 cloned = (Employee8) super.clone();

        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year, int month,int day) {
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee8{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
