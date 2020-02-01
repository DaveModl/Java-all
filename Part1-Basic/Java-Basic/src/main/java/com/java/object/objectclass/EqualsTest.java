package com.java.object.objectclass;

import com.java.object.inheritance.emp.Manager;
import com.java.object.objectclass.emp.Employee6;
import com.java.object.objectclass.emp.Manager2;

public class EqualsTest {
    public static void main(String[] args) {
        Employee6 emp1 = new Employee6("EMP1",75000,1999,1,1);
        Employee6 emp2 = emp1;
        Employee6 emp3 = new Employee6("EMP1",75000,1999,1,1);
        Employee6 emp4 = new Employee6("EMP4",23456,1989,2,22);

        System.out.println("emp1 == emp2 " + (emp1 == emp2));
        System.out.println("emp1 == emp3 " + (emp1 == emp3));

        System.out.println("emp1.equals(emp3) " + emp1.equals(emp3));
        System.out.println("emp1.equals(emp4) " + emp1.equals(emp4));

        System.out.println("emp4.toString(): " + emp4);

        Manager2 man1 = new Manager2("MAN1",80000,1988,12,3);
        Manager2 man2 = new Manager2("MAN1",80000,1988,12,3);
        man2.setBonus(5000);

        System.out.println("man2.toString(): " + man2);
        System.out.println("man1.equals(man2) " + man1.equals(man2));

        System.out.println("emp1.hashCode():" + emp1.hashCode());
        System.out.println("emp3.hashCode():" + emp3.hashCode());

        System.out.println("man1.hashCode():" + man1.hashCode());
        System.out.println("man2.hashCode():" + man2.hashCode());
    }
}
