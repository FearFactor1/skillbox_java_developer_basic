package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            List<String> lines = Files.readAllLines(Paths.get("data/info.txt"));
            lines.forEach(line -> builder.append(line + "\n"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}
