package com.java.object.reflects;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 反射获取类的相关信息
 */
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0){
            name = args[0];
        }else {
            Scanner in = new Scanner(System.in);
            System.out.println("Input class name:");
            name = in.next();
        }

        try {
            //获取类对象
            Class cla = Class.forName(name);
            //获取父类
            Class superCla = cla.getSuperclass();
            //获取类的修饰符
            String modifiers = Modifier.toString(cla.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superCla != null && superCla != Object.class){
                System.out.print(" extends " + superCla.getName());
            }
            System.out.print("\n{\n");
            printConstructors(cla);
            System.out.println();
            printMethods(cla);
            System.out.println();
            printField(cla);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void printField(Class cla) {
        Field[] fields = cla.getFields();

        for (Field field : fields){
            Class type = field.getType();
            String name = field.getName();

            System.out.print("   ");
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print(type.getName() + " " + name + ";");
        }
    }

    private static void printMethods(Class cla) {
        //获取所有方法
        Method[] methods = cla.getMethods();

        for (Method method : methods){
            Class retType = method.getReturnType();
            String name = method.getName();

            System.out.print("   ");
            String modifiers = Modifier.toString(method.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramTypes = method.getParameterTypes();
            for (int i = 0; i < paramTypes.length ; i++) {
                if (i > 0){
                    System.out.print(", ");
                }
                System.out.println(paramTypes[i].getName());
            }
            System.out.println(");");

        }
    }

    private static void printConstructors(Class cla) {
        //获取所有构造器
        Constructor[] constructors = cla.getConstructors();

        for(Constructor constructor : constructors){
            String name = cla.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(constructor.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            //获取参数类型
            Class[] paramTypes = constructor.getParameterTypes();
            for (int i = 0; i < paramTypes.length ; i++) {
                if (i > 0){
                    System.out.print(", ");
                }
                System.out.println(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }
}
