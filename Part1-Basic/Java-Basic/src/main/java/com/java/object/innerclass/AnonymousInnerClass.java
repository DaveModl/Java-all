package com.java.object.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
         new Thread(new Runnable() {
            /**
             * 线程的Runnable匿名内部类
             */
            @Override
            public void run() {
                System.out.println("running");
            }
        }).start();
    }
}
