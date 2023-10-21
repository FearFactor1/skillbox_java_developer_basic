package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        properties.setProperty("timeout", "3600");
//        properties.setProperty("cacheSize", "10000");
//
//        properties.store(new FileOutputStream("data/config.properties"), "");

        Properties properties = new Properties();
        properties.load(new FileInputStream("data/config.properties"));
        System.out.println(properties.getProperty("cacheSize"));
    }
}