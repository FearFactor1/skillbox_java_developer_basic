package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main6 {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        executor.getCompletedTaskCount();
    }
}
