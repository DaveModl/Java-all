package com.java.object.innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outter.Inner inner = new Outter.Inner();
        System.out.println(inner);
    }
}
class Outter{
    static class Inner{
        public Inner(){
            System.out.println("static inner");
        }
    }
}
