package org.example;

import java.util.ArrayList;
import java.util.Vector;

public class Main3 {

    private static Vector<Double> numbers = new Vector<>();

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            threads.add(new Thread(() -> {
                for(int j = 0; j < 100000; j++) {
                    numbers.add(Math.random());
                }
                System.out.println(numbers.size());
            }));
        }
        threads.forEach(Thread::start);
    }

//    private static void someHeavyMethod() {
//        for(int i = 0; i < 1000000; i++) {
//            double value = Math.random() / Math.random();
//            synchronized(numbers) {
//                numbers.add(value);
//            }
//        }
//        System.out.println(numbers.size());
//        numbers.clear();
//    }
}