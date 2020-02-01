package com.java.basic.control;

public class SwitchDemo {
    public static void main(String[] args) {
        /**
         * switch case标签可以是 char byte short int enum String字面量
         * switch会执行与case匹配的语句块，直到遇到break为止
         * 没有匹配则执行default
         */
        String str = "A";
        switch (str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("None");
        }
    }
}
