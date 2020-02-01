package com.java.object;

public class VariableParamTest {
    public static void main(String[] args) {
        System.out.println(max(3.1,4.5,7.6,-1));
    }
    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for(double value : values){
            if (value > largest){
                largest = value;
            }
        }
        return largest;
    }
}
