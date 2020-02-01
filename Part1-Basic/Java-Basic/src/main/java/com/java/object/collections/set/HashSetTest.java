package com.java.object.collections.set;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 散列表：桶bucket 满了之后转为平衡二叉树
 * 顺序随机,不重复的元素
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        try(InputStream in = new FileInputStream(new File("D:\\Java-Basic\\Java-Basic\\src\\main\\resources\\test.txt"))){
            int b;
            while (in.read() != -1){
                b = in.read();
                char ch = (char) b;
                String word = String.valueOf(ch);
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
            Iterator<String> iterator = words.iterator();
            for (int i = 1; i <= 20 && iterator.hasNext() ; i++) {
                System.out.println(iterator.next());
            }
            System.out.println("...");
            System.out.println(words.size() + " distinct words " + totalTime + "ms.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
