package com.java.basic.input;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        //读取文件
        Scanner in = new Scanner(Paths.get("D:\\Java-Basic\\Java-Basic\\src\\main\\resources\\myfile.txt"), "UTF-8");
        //写入文件
        PrintWriter out = new PrintWriter("D:\\Java-Basic\\Java-Basic\\src\\main\\resources\\myfile.txt","UTF-8");
    }
}
