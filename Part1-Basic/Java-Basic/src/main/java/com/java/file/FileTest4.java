package com.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTest4 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\filemsg","a.txt");
        long fileSize = Files.size(path);
        /**
         * 获取文件基本信息
         */
        BasicFileAttributes attributes = Files.readAttributes(path,BasicFileAttributes.class);
        System.out.println(attributes.creationTime() + "\n" + attributes.lastAccessTime()
        + "\n" + attributes.lastModifiedTime() + "\n" + attributes.isRegularFile() + "\n"
                + attributes.isDirectory() + "\n" + attributes.isSymbolicLink()
        + "\n" + attributes.size() + "\n" + attributes.fileKey());
    }
}
