package com.java.object.collections.queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * 优先级队列：remove()总返回最小的元素
 * heap
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> queue = new PriorityQueue<>();
        queue.add(LocalDate.of(1993,10,6));
        queue.add(LocalDate.of(1993,10,6));
        queue.add(LocalDate.of(1994,10,6));
        queue.add(LocalDate.of(1995,10,6));
        queue.add(LocalDate.of(1987,10,6));

        for (LocalDate date : queue){
            while (!queue.isEmpty()){
                System.out.println(queue.remove());
    }
    }

    }
}
