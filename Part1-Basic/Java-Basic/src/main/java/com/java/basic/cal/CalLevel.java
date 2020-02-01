package com.java.basic.cal;

/**
 * 其他运算符： ++,--,=,==,<,>,<=,>=,!
 * ?
 * &&,|| 短路与/或
 * &,|,~,^
 * >>,<<,>>>
 */

public class CalLevel {
    public static void main(String[] args) {
        //三目运算
        int x = 2,y = 3;
        System.out.println(x < y ? y : x);
        //自增/自减
        int res1 = 2 * ++x;
        int res2 = 2 * x++;
        System.out.println(res1);
        System.out.println(res2);
        //短路运算
        int f = 1;
        //f+1 > 1不再计算
        System.out.println(false && f+1 > 1);
        System.out.println( f+1 > 1 || false);
        //位运算
        int n = 5;
        int nn = (n & 0b1000) / 0b1000;
        System.out.println(nn);
        int n2 = 16;
        //右移/2^n，符号为填充高位
        System.out.println(n2 >> 2);
        //左移*2^n
        System.out.println(n2 << 4);
        int n3 = 4;
        //0填充高位
        System.out.println(n3 >>> 1);
    }
    /**
     * 优先级
     * [].()(方法调用) L -> R
     * ! ~ ++ -- +(一元运算) - (一元运算) new R -> L
     * * / %
     * + -
     * << >> >>>
     * < <= > >= instanceof
     * == !=
     * &
     * ^
     * |
     * &&
     * ||
     * ?:\   R -> L
     * = += -= *= /= %= &= != ^= <<= >>= >>>=
     */
}
