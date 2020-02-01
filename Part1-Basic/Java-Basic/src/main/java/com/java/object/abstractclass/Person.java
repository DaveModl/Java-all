package com.java.object.abstractclass;

public abstract class Person {
    public abstract String getDescription();
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
