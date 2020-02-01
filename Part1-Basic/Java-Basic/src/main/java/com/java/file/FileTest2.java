package com.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\newDir","newFile.txt");
        Path path2 = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\newDir");
        //Files.createDirectories(path);
//        Files.createFile(path);
        Path newPath = Files.createTempFile(path2,null,".txt");


    }
}
