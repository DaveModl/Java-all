package com.java.object.objectclass.emp;

import com.java.object.inheritance.emp.Manager;

import java.util.Objects;

public class Manager2 extends Employee6{
    private double bonus;
    public Manager2(String name,double salary,int year,int month,int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double baseSalary =  super.getSalary();
        return baseSalary + this.bonus;
    }

    @Override
    public boolean equals(Object otherM){
        if (!super.equals(otherM)){
            return false;
        }
        Manager2 manager = (Manager2) otherM;
        return bonus == ((Manager2) otherM).bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString() {
        return super.toString() +
                "[bonus=" + bonus +
                ']';
    }
}
