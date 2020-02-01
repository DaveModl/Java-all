package com.java.object.interfaces;

public class InterfaceConflictTest implements Person,Named {
    @Override
    public String getName() {
        //自己选择
        return Person.super.getName();
    }

    public static void main(String[] args) {
        System.out.println(new InterfaceConflictTest().getName());
    }
}
interface Person {

    default String getName(){
        return "a";
    }
}
interface Named{
    default String getName() {
        return getClass().getName() + "_" + hashCode();
    }
}
