package com.java.object.generics;

public class PairTest {
    public static void main(String[] args) {
        String[] words = {"Mary","had","a","little","lamb"};
        PairT<String> mm = ArrayAlg.minMax(words);
        System.out.println("min= " + mm.getFirst());
        System.out.println("max= " + mm.getSecond());
    }
}

class ArrayAlg{
    public static PairT<String> minMax(String[] s){
        if (s == null ||s.length == 0){
            return null;
        }
        String min = s[0];
        String max = s[0];
        for (int i = 1; i < s.length ; i++) {
            if (min.compareTo(s[i]) > 0){
                min = s[i];
            }
            if (max.compareTo(s[i]) < 0){
                max = s[i];
            }
        }
        return new PairT<>(min,max);
    }
}
