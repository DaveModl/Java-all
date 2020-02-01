package com.java.basic.datatype;

/**
 * 有一个操作数为double,另一个操作数也会转为double
 * 否则，有一个操作数为float,另一个操作数也会转为float
 * 否则，有一个操作数为long,另一个操作数也会转为long
 * 否则，两个操作数都将被转为int
 */
public class TypeCast {
    public static void main(String[] args) {
        double x = 9.875;
        //大类型转小类型时需要强制转换，且会丢失精度
        int ix = (int) x;
        //不能将一个人超出类型范围的值进行强制转换
        byte b = (byte) 300;
        System.out.println(b);
    }
}
