package com.java.object.interfaces;

public class Student extends Person2 implements Named2 {
    @Override
    public void print() {
        super.print();
        System.out.println("Student");
    }

    public static void main(String[] args) {
        new Student().print();
    }
}

/**
 * 接口和类发生命名冲突则类方法优先
 */
interface Named2{
   default void print(){
       System.out.println("Name");
   }
}