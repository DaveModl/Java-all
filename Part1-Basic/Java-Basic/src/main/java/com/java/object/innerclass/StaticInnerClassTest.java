package com.java.object.innerclass;

public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length ; i++) {
            d[i] = 100 * Math.random();
        }
        ArrayAlg.Pair pair = ArrayAlg.minmax(d);
        System.out.println("min = " + pair.getFirst());
        System.out.println("max = " + pair.getSecond());
    }
}

class ArrayAlg{
    /**
     * 静态内部类
     */
    public static class Pair{
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static Pair minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double d : values){
            if (min > d){
                min = d;
            }
            if (max < d){
                max = d;
            }
        }
        return new Pair(min,max);
    }
}
