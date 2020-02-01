package com.java.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path absolute = Paths.get("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources", "path.txt");
        System.out.println(absolute);
        Path relative = Paths.get("src","main","resource","parts.t  xt");
        System.out.println(relative);
        Path parent = relative.getParent();
        System.out.println(parent);
        Path file = relative.getFileName();
        System.out.println(file);
        Path root = relative.getRoot();
        System.out.println(root);
    }
}
