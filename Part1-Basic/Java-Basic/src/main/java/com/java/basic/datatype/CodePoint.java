package com.java.basic.datatype;

public class CodePoint {
    public static void main(String[] args) {
        String greeting = "Hello";
        //代码单元数量
        System.out.println(greeting.length());
        //码点数量
        System.out.println(greeting.codePointCount(0,greeting.length()));
        //取得代码单元
        char first = greeting.charAt(0);
        //获取第4个位置的码点
        System.out.println(greeting.codePointAt(greeting.offsetByCodePoints(0,4)));

    }
}
