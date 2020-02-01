package com.java.object.enums;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        String input =  in.next().toUpperCase();

        Msg msg = Enum.valueOf(Msg.class,input);
        System.out.println("msg " + msg + " " + msg.getStr() + " " + msg.ordinal());
        if (msg == Msg.HELLO){
            System.out.println("H word");
        }
    }
}

enum Msg{
    HELLO("H"),WORD("W"),SOME("S");

    private String str;
    private Msg(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

/**
 * Enum比较不需要equals
 * 可添加构造器，方法，域
 * String toString()
 * int compareTo(E other)
 * 在other前为负值，一样为0，否则为正
 */