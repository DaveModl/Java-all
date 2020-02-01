package com.java.object.exception;

import java.util.Scanner;

public class StackTraceTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = in.nextInt();
        fact(n);
    }

    private static int fact(int n) {
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] traceElements = t.getStackTrace();
        for (StackTraceElement traceElement : traceElements){
            System.out.println(traceElement);
        }
        int r;
        if (n <= 1){
            r = 1;
        }else {
            r = n * fact(n-1);
        }
            System.out.println("return " + r);
        return r;
    }
}
