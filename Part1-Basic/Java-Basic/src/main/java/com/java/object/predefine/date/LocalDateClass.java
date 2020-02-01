package com.java.object.predefine.date;

import java.time.LocalDate;

/**
 * 内置JDK8日期函数
 */
public class LocalDateClass {
    public static void main(String[] args) {
        //使用静态方法构建类对象
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //构建一个指定的时间
        LocalDate date2 = LocalDate.of(1993,10,06);

        //新对象赋值给newDate，date2没有发生变化
        LocalDate newDate = date2.plusDays(3600);
        int year = newDate.getYear();
        int month = newDate.getMonthValue();
        int day = newDate.getDayOfMonth();

        System.out.println(year + "-" + month + "-" + day);
        System.out.println(date2);

    }
}
