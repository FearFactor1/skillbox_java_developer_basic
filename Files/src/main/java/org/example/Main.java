package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("data/info.txt");
        System.out.println(file.length());

        File folder = new File("data/");
        File[] files = folder.listFiles();
        for (File file2 : files) {
            System.out.println(file2.getAbsolutePath());
        }
    }
}