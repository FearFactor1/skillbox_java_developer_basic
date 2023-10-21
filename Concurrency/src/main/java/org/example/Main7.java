package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main7 {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
        service.schedule(() -> System.out.println("YES"), 1000, TimeUnit.MILLISECONDS);
        service.scheduleAtFixedRate(() -> System.out.println("TTT"), 1000, 2000, TimeUnit.MILLISECONDS);
    }
}
