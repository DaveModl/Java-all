package com.java.object.init;

public class InitOrder {
    private int num;
    private static double dNum =2.0;
    private static boolean flag;
    {
        num = 2;
    }

    static {
        flag = true;
    }

    public InitOrder(int num) {
        this.num = num + 1;
    }
    /**
     * 初始化方式:
     * 1.
     * 在默认构造器中
     * 会初始化数据域的数据为默认值
     * 0，null,flase
     * 2.显示初始化
     * 3.初始化块
     * order:
     * 静态初始化/静态初始化块，按出现顺序 --> 初始化话语句/初始化块 --> 构造器
     */
}
