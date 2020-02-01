package com.java.basic.cal;

/**
 * 基本运算符:+ - * / *
 */
public class CalBaisc {
    //strictfp可严格执行浮点运算
    public static strictfp void main(String[] args) {
        //精度问题
        double res = 0.2 + 0.1;
        int a = 2;
        a += 5;
        a *= 5;
        a %= 5;
        a /= 5;
        System.out.println(res);
    }
}
