package com.java.object.interfaces.emp;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee7[] staff = new Employee7[3];

        staff[0] = new Employee7("A",35000);
        staff[1] = new Employee7("B",45000);
        staff[2] = new Employee7("C",15000);

        Arrays.sort(staff);

        for(Employee7 employee : staff){
            System.out.println(employee);
        }
    }
}
