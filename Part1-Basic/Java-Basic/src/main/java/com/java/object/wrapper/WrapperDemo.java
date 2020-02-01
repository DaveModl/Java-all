package com.java.object.wrapper;

import org.omg.CORBA.IntHolder;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        //自动装箱的过程
        //list.add(Integer.valueOf(3));
        int n = list.get(0);
        //自动拆箱的过程
        // int n = list.get(0).intValue();

        Integer a = 100;
        Integer b = 100;
        //可能相等
        System.out.println(a == b);
        System.out.println(a.equals(b));

        //自动提升
        Integer i = 3;
        Double d = 2.0;
        System.out.println(true ? i : d);
        //Integer是final的
        Integer y = 2;
        System.out.println(y);

        //实现数值修改
        IntHolder x = new IntHolder(3);
        add(x);
        System.out.println(x.value);



        /**
         * boolean,byte,char <=127 (-128 - 127)
         */

    }
    public static void add(IntHolder x){
        x.value += 2;
    }
    public static void add(Integer x){
        x += 2;
    }
}
/**
 * Integer
 * Long
 * Float
 * Double
 * Short
 * Byte
 * Character
 * Void
 * Boolean
 * -----------------------
 * Integer常见方法
 * int intValue()
 * static String toString(int i)
 * static String toString(int i,int radix)
 * static int pareInt(String s)
 * static int pareInt(String s,int radix)
 * static int valueOf(String s)
 * static int valueOf(String s,int radix)
 *
 */
