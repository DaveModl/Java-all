package com.java.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesTest3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources", "path.txt");
        Path newPath = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\copy", "path.txt");
//        InputStream in = null;
//        OutputStream out = null;
//        Files.copy(in,newPath);
//        Files.copy(path,out);
        Files.copy(path,newPath, StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
        //保证移动的原子性
//        Files.move(path,newPath,StandardCopyOption.ATOMIC_MOVE);
        boolean flag = Files.deleteIfExists(newPath);
        System.out.println(flag);

    }
}
