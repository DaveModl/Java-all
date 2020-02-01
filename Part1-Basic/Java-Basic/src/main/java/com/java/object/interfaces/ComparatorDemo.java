package com.java.object.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
        String[] strs = {"Peter","Pual","Mary"};
        Arrays.sort(strs,new ComparatorDemo());
        System.out.println(Arrays.toString(strs));
    }
}
