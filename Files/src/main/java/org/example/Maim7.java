package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Maim7 {
    public static void main(String[] args) {
        try {
            ArrayList<String> strings = new ArrayList<>();
            for (int i =0; i < 1000; i++) {
                strings.add(Integer.toString(i));
            }
            Files.write(Paths.get("data/file2.txt"), strings);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
