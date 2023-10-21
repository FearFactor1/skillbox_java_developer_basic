package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main3 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader("data/info.txt"));
            for (;;) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                builder.append(line + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}
