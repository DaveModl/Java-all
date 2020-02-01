package com.java.basic.datatype;

/**
 * 构建字符串，非线程安全
 * 对应线程安全的StringBuffer
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String s = "A";
        for (int i = 0; i < 5; i++) {
        builder.append(s);
        }
        System.out.println(builder.toString());
    }
}
/**
 * StringBuilder()
 * int length()
 * StringBuilder append()
 * void setCharAt(int i,char c)
 * StringBuilder insert(int offset,String str) 插入一个字符串返回this
 * StringBuilder delete(int start,int end)
 * String toString()
 */