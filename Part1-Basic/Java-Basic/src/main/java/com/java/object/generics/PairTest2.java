package com.java.object.generics;

import java.time.LocalDate;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] dates = {
                LocalDate.of(1993,10,6),
                LocalDate.of(1994,4,5),
                LocalDate.of(1978,10,11),
                LocalDate.of(1999,1,6),
        };

        PairT<LocalDate> mm = ArrayAlg2.minMax(dates);
        System.out.println("min= " + mm.getFirst());
        System.out.println("max= " + mm.getSecond());
    }
}

class ArrayAlg2{
    //泛型方法，确定变量类型边界
    public static <T extends Comparable> PairT<T> minMax(T[] t){
        if (t == null || t.length == 0){
            return null;
        }
        T min = t[0];
        T max = t[0];

        for (int i = 1; i < t.length ; i++) {
            if (min.compareTo(t[i]) > 0){
                min = t[i];
            }
            if (max.compareTo(t[i]) < 0){
                max = t[i];
            }
        }

        return new PairT<>(min,max);
    }
}