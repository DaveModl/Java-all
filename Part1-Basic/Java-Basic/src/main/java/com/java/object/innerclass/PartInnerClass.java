package com.java.object.innerclass;

public class PartInnerClass {
    public static void main(String[] args) {
        B b = new B();
        b.doSomething();
    }
}

class A {

}

class B{
    public A doSomething(){
        /**
         * 局部内部类和局部变量有一样的性质
         */
        class C extends A{
            int i = 1;
            C(){
                print();
            }
            void print(){
                System.out.println("part C");
            }
        }
        return new C();
    }
}
