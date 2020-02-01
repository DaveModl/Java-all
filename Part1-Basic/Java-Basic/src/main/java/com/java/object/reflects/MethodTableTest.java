package com.java.object.reflects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTableTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Method square = MethodTableTest.class.getMethod("square",double.class);
        Method sqrt = Math.class.getMethod("sqrt",double.class);

        printTable(1,10,10,square);
        printTable(1,10,10,sqrt);
    }

    public static double square(double x){
        return x * x;
    }

    private static void printTable(double i, double i1, int i2, Method method) {
        System.out.println(method);
        double dx = (i1 - i) / (i2 - 1);

        for (double j = i; j <= i1; j += dx) {
            try {
                double y = (double) method.invoke(null,j);
                System.out.printf("%10.4f | %10.4f%n",j,y);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
/**
 * Object invoke(Object obj,Object... args)
 * 隐式参数，其余对象提供了显式参数，则需提供对象数组，没有则是null
 * 调用这个对象描述的方法，传递给定参数，并返回方法返回值，静态方法把null作为隐式参数传递
 * 使用包装类传递基本类型值时，返回值必须是未包装的
 */
