package com.java.object.collections.item;

import java.util.Objects;

public class Item implements Comparable<Item> {
    private String description;
    private int partNum;

    public Item(String description, int partNum) {
        this.description = description;
        this.partNum = partNum;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Item item = (Item) o;
        return partNum == item.partNum &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNum);
    }

    @Override
    public int compareTo(Item o) {
        int diff = Integer.compare(partNum,o.partNum);
        return diff != 0 ? diff : description.compareTo(o.description);
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNum=" + partNum +
                '}';
    }
}
