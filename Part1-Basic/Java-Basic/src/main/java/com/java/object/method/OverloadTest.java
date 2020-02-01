package com.java.object.method;

public class OverloadTest {
    /**
     * 方法重载：在同一个类中
     * 相同的名字，不同的参数
     * （方法签名：方法名，参数类型，个数，顺序）
     * 返回值不是方法签名的一部分
     * 可重载任何方法，包括构造器
     */
    public static void add(int x){
        x = x + 10;
        System.out.println(x);
    }

    public static void add(double x){
        x = x + 20;
        System.out.println(x);
    }

    public static void main(String[] args) {
        add(10);
        add(2.5);
    }
}
