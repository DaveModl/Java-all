package com.java.basic.control;

import java.util.Scanner;

/**
 * 来源PDF的流程控制代码
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        String input;
        /**
         * 至少执行一次循环体
         */
       do{
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
            //格式化输出
           System.out.printf("After year %d,you balance is %,.2f%n",year,balance);

           System.out.println("Ready to retire? (Y/N)");
           input = in.next();
        }while (input.equals("N"));
    }
}
