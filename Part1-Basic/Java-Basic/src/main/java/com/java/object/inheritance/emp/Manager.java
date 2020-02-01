package com.java.object.inheritance.emp;

public class Manager extends Employee4 {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + super.getName() +
                " ,salary=" + super.getSalary() +
                " ,bonus=" + bonus +
                " ,hireDay=" + super.getHireDay() +
                '}';
    }
}
