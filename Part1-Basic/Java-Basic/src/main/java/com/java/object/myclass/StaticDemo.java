package com.java.object.myclass;

import sun.awt.windows.WPrinterJob;

public class StaticDemo {
    /**
     * 1.静态域
     * 所有的类对象共享id属性
     */
    private static int id = 1;
    /**2.静态常量*/
    private static final double MY_PI = 3.14;

    private int var = 2;

    /**
     * 3.静态方法
     * 静态方法中不能调用非静态方法
     */
    public static double calValue(){
//        print();
        int basic = 4;
        return basic * MY_PI;
    }

    /**
     * 非静态方法中可调用静态方法
     */
    public  double calNoStatic(){
        return calValue();
    }

    public void print(){
        System.out.println("printing something...");
    }

    public static void main(String[] args) {
        StaticDemo demo = new StaticDemo();
        System.out.println(demo.calNoStatic());
    }
}
/**
 * 所有的静态相关的域，常量，方法均属于类对象，所以应该使用类对象调用，并不属于一个单独的对象实例
 * 使用情况：
 * 一个方法不需要访问对象状态，其所需的参数都是通过像是参数提供
 * 一个方法只需要访问类的静态域
 */