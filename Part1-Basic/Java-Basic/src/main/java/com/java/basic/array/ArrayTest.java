package com.java.basic.array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int [] a = new int[100];
        for (int i = 0; i < 100 ; i++) {
            a[i] = i;
        }
        /**
         * 1.遍历
         */
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-----------------------------");
        /**
         * 增强for循环
         */
        for (int element : a){
            System.out.println(element);
        }

        /**
         * 数组转字符串
         */
        System.out.println(Arrays.toString(a));

        /**
         * 数组初始化与匿名数组
         */
        int[] b ={2,3,5,7};
        //匿名数组
        b = new int[] {4,6,8,10};

    }
}
/**
 * Arrays检查相等的静态方法
 * static boolean equals(type[] a,type[] b)
 * static boolean equals(Object a,Object b) a,b都为null true 其中一个为null返回false 否则返回a.equals(b)
 */
