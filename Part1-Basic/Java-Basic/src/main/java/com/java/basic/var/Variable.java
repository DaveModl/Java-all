package com.java.basic.var;

public class Variable {
    /**类常量*/
    public static final int CLASS_CON_NUM = 10;
    public static void main(String[] args) {
        //变量声明
        int a;
        //初始化
        a = 10;

        //声明同时初始化
        double b = 0.52;

        //常量,只能赋值一次，之后不能更改
        final int CON_NUM = 20;
    }
}
