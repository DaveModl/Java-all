package com.java.object.collections.set;

import com.java.object.collections.item.Item;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 有序散列表
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("CC",12));
        parts.add(new Item("zz",14));
        parts.add(new Item("xx",444));
        parts.add(new Item("SS",55));
        System.out.println(parts);

        NavigableSet<Item> sortByDesc = new TreeSet<>(Comparator.comparing(Item::getDescription));

        sortByDesc.addAll(parts);
        System.out.println(sortByDesc);
    }
}
