package com.java.object.collections.map;

import com.java.object.inheritance.emp.Employee4;

import java.util.HashMap;
import java.util.Map;

/**
 * 快速查找元素
 * k-v
 * key必须唯一，同一key的两次put()会覆盖
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee4> staff = new HashMap<>();
        int i = 0;
        staff.put(++i+"",new Employee4("AA"));
        staff.put(++i+"",new Employee4("BBB"));
        staff.put(++i+"",new Employee4("C"));
        staff.put(++i+"",new Employee4("DDDD"));

        System.out.println(staff);

        staff.remove("2");

        staff.put("4",new Employee4("newDDDD"));

        System.out.println(staff.get("3"));

        staff.forEach((k,v) ->
                System.out.println("key=" + k + " value=" + v));

        System.out.println();
        for (Map.Entry<String,Employee4> entry : staff.entrySet()){
            String key = entry.getKey();
            Employee4 value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
