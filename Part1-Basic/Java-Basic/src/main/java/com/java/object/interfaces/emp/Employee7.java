package com.java.object.interfaces.emp;

public class Employee7 implements Comparable<Employee7> {
    private String name;
    private double salary;

    public Employee7(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * < o return <0
     * = o return =0
     * > o return >0
     * @param o
     * @return
     */
    @Override
    public int compareTo(Employee7 o) {
        return Double.compare(salary,o.salary);
    }

    @Override
    public String toString() {
        return "Employee7{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
