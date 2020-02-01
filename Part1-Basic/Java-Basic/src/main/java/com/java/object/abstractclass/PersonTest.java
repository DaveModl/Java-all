package com.java.object.abstractclass;

import com.java.object.abstractclass.emp.Employee5;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee5("A",50000,1999,10,8);
        people[1] = new Student("E","cs");

        for (Person person : people){
            System.out.println(person.getName() + " " + person.getDescription());
        }
    }
}
