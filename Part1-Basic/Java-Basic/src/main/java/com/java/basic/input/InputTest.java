package com.java.basic.input;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        //标准输入输出--控制台
        //创建一个标准输入流对象
        Scanner in = new Scanner(System.in);

        System.out.println("get String");
        String str = in.nextLine();

        System.out.println("get integer");
        int i = in.nextInt();

//        Console console = System.console();
//        String name = console.readLine("name is: ");
//        char[] password = console.readPassword("password: ");
//        System.out.println(name +" " + password.toString());
    }
}
/**
 * Scanner(InputStream in)
 * String nextLine()读取一行
 * String next() 对象下一个单词 （空格分隔符）
 * int nextInt()
 * double nextDouble()
 * boolean hasNext()
 * boolean hasNextInt()
 * boolean hasNextDouble()
 */
