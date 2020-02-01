package com.java.object.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 与顺序表相比,插入和删除比较快
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Aa");
        list.add("Bb");
        list.add("Cc");

        List<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");

        /**
         * 将list2合并到list
         */
        ListIterator<String> listIterator = list.listIterator();
        Iterator<String> list2Iterator = list2.iterator();

        while (list2Iterator.hasNext()){
            if (listIterator.hasNext()){
                listIterator.next();
            }
            listIterator.add(list2Iterator.next());
        }
        System.out.println(list);

        list2Iterator = list2.iterator();
        while (list2Iterator.hasNext()){
            list2Iterator.next();
            if (list2Iterator.hasNext()){
                list2Iterator.next();
                list2Iterator.remove();
            }
        }
        System.out.println(list2);

        list.removeAll(list2);
        System.out.println(list);
    }
}
