package com.java.basic.control;

public class InterruptLoop {
    public static void main(String[] args) {
        /**
         * 1.break跳出整个循环
         */
        for (int i = 0; i < 5 ; i++) {
            if (i == 3){
                break;
            }
            System.out.println("我一共循环" + (i+1) +"次");
        }
        /**
         * 2，break 跳出标签位置的循环
         * 类似于goto
         */
        label:
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 4 ; j++) {
                if ( i == 2){
                    break label;
                }
                System.out.println("outer" + (i+1) + "次," + "inner " + (j+1) + "次");
            }
        }
/**
 * 3.continue跳出本次循环后继续执行循环
 */
        int count = 0;
        for (int i = 0; i < 5 ; i++) {
            if (i == 3){
                System.out.println("i = "+i+"跳过");
                continue;
            }
            count++;
            System.out.println("我一共循环" + count +"次");
        }
    }
}
