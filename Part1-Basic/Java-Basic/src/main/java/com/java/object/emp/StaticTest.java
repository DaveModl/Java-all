package com.java.object.emp;

public class StaticTest {
    public static void main(String[] args) {
        Employee2[] staff = new Employee2[3];
        staff[0] = new Employee2("A",40000);
        staff[1] = new Employee2("B",44000);
        staff[2] = new Employee2("C",45000);

        for (Employee2 employee : staff){
            System.out.println(employee);
        }

        int n = Employee2.getNextId();
        System.out.println("nextID= " + n);
    }
}

class Employee2{
    private String name;
    private double salary;
    private int id;
    private static int nextId = 1;

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Employee2 emp = new Employee2("D",50000);
        System.out.println(emp.getName() + " " + emp.getSalary());
    }
}
