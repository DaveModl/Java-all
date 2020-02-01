package com.java.basic.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //两个引用指向同一个数组
        int[] a = {2,3,4,5};
        int[] b = a;
        System.out.println(b[3]);

        //拷贝到一个新数组
        int[] c = Arrays.copyOf(b,b.length);
        //拷贝与扩容
        b = Arrays.copyOf(b,2*b.length);
        System.out.println(Arrays.toString(b));
    }
}
