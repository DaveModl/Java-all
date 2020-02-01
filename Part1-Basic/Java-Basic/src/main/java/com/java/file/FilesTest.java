package com.java.file;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources", "path.txt");
        //读取文件内容到字节数组
        byte[] bytes = Files.readAllBytes(path);
        //将内容转字符串读入
        String context = new String(bytes,"UTF-8");
//        System.out.println(context);
        //将内容作为序列读入
//        List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
//        System.out.println(lines);
        //写入到文件
        Path path2 = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources", "path2.txt");
//        Files.write(path2,context.getBytes("UTF-8"));
        //允许追加内容
        Files.write(path2,context.getBytes("UTF-8"), StandardOpenOption.APPEND);

        /**
         * 流
         */
        InputStream in = Files.newInputStream(path);
        OutputStream out = Files.newOutputStream(path);
        Reader rin = Files.newBufferedReader(path,Charset.forName("UTF-8"));
        Writer wout = Files.newBufferedWriter(path,Charset.forName("UTF-8"));
    }
}
