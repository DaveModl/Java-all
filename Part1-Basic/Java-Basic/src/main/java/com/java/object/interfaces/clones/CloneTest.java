package com.java.object.interfaces.clones;

public class CloneTest {
    public static void main(String[] args) {
        Employee8 original = new Employee8("A",50000);
        original.setHireDay(1999,1,1);
        try {
            Employee8 copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2000,1,2);
            System.out.println("original " + original);
            System.out.println("copy" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
