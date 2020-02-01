package com.java.object.predefine.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class OldDateClass {
    public static void main(String[] args) {
        GregorianCalendar someDay = new GregorianCalendar(1993,10,6);
        //改变的是原对象
        someDay.add(Calendar.DAY_OF_MONTH,1000);
        int year = someDay.get(Calendar.YEAR);
        int month = someDay.get(Calendar.MONTH);
        int day = someDay.get(Calendar.DAY_OF_MONTH);
        System.out.println(someDay.toZonedDateTime().toString());
    }
}
