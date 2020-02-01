package com.java.object.reflects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCapacityTest {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        a = (int[]) goodCopyOf(a,10);
        System.out.println(Arrays.toString(a));

        String[] b = {"a","b","c"};
        b = (String[]) goodCopyOf(b,10);
        System.out.println(Arrays.toString(b));
        //Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
        //b = (String[]) badCopyOf(b,10);
    }

    /**
     * 返回对象数组 不能转换成AnyType[]
     * @param a
     * @param newLength
     * @return
     */
    public static Object[] badCopyOf(Object[] a, int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object a,int newLength){
        Class cla = a.getClass();
        if (!cla.isArray()){
            return null;
        }
        Class array = cla.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(array,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }
}
