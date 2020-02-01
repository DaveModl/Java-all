package com.java.basic.array;

public class CommandArray {
    public static void main(String[] args) {
        /**
         * args接受命令参数的数组
         */
        if (args != null && args.length != 0){
            for (int i = 0; i < args.length ; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
