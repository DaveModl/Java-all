package com.java.object.reflects;

import java.util.Random;

public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /**
         * Class<T>类
         */
        A a = new A("A1");
        Class cla = a.getClass();
        System.out.println(a.getClass().getName() + " " + a.getName());

        String classStr = "java.lang.String";
        Class strCla = Class.forName(classStr);
        System.out.println(strCla.toString());
        //Clas<Random>
        Class cla2 = Random.class;
        System.out.println(cla2);

        //
        Object obj = Class.forName(a.getClass().getName()).newInstance();
        System.out.println(obj);

        /**
         * Field 域  Method 方法 Constructor 构造器
         */

    }
}

class A{
    private String name;

    public A(){}

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
/**
 * Object newInstance(Object[] args)
 */