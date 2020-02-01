package com.java.object.reflects;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj){
        if (obj == null){
            return "null";
        }
        if (visited.contains(obj)){
            return "...";
        }
        visited.add(obj);
        Class cla = obj.getClass();

        if (cla == String.class){
            return (String) obj;
        }

        if (cla.isArray()){
            //判断数组类型的反射
            String r = cla.getComponentType() + "[]{";
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0){
                    r += ",";
                }
                Object val = Array.get(obj,i);
                //原始数据类型
                if (cla.getComponentType().isPrimitive()){
                    r += val;
                }else {
                    r += toString(val);
                }
                return r + "}";
            }
        }
            String r = cla.getName();
        do {
            r += "[";
            Field[] fields = cla.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);

            for (Field field : fields){
                if (!Modifier.isStatic(field.getModifiers())){
                    if (!r.endsWith("[")){
                        r += ",";
                    }
                    r += field.getName() + "=";

                    try {
                    Class t = field.getType();
                        Object val = field.get(obj);
                        if (t.isPrimitive()){
                            r += val;
                        }else {
                            r += toString(val);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cla = cla.getSuperclass();
        }while (cla != null);
        return r;
    }
}
