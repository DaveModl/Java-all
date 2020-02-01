package com.java.object.collections.list;





import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<ATest> aTests = new ArrayList<>();
        aTests.add(new ATest("A1",1994,2,3));
        aTests.add(new ATest("A2",1995,2,5));
        aTests.add(new ATest("A3",1996,2,6));

        for (ATest aTest : aTests){
            System.out.println(aTest);
        }
    }
}
class ATest{
    private String name;
    private LocalDate date;

    public ATest(String name, int year,int month,int day) {
        this.name = name;
        this.date = LocalDate.of(year,month,day);
    }

    @Override
    public String toString() {
        return "ATest{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
/**
 * ArrayList<E>()
 * ArrayList<E>(int initCapacity)
 * boolean add(E obj)
 * int size()
 * void ensureCapacity(int capacity)
 * void trimToSize() --- 消减数组到当前尺寸
 *---------------------------------------------
 * void set(int index,E obj)
 * E get(int index)
 * void add(int index,E obj)
 * E remove(int index)
 */
