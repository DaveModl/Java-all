package com.java.basic.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * PDF上的Arrays.sort()
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("How manys numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number number you can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length ; i++) {
            //0 - n-1的随机数
            int r = (int) (Math.random() * n);

            result[i] = numbers[r];

            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("result is ");
        for (int r : result){
            System.out.println(r);
        }
    }
}
/**
 * static String toString[Type[] a]
 * static Type copyOf(Type[] a, int length)
 * static Type copyOfRange(Type[] a,int start,int end) [start,end)
 * static void sort(Type[] a) 快速排序
 * static int binarySearch(Type[] a,Type v) 返回下标值
 * static int binarySearch(Type[] a,int start,int end,Type v)如果没有找到返回负数r，-r-保持a有序v擦汗如到响应的位置
 * static void fill(Type[] a,Type v) 将数组全部设为v值
 * static boolean equals(Type[] a,Type[] b)
 */