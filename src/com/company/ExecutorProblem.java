package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorProblem {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(() -> {
            System.out.println("Hello!");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        });
        executor.shutdown();

        try {
            boolean terminated = executor.awaitTermination(2000, TimeUnit.MILLISECONDS);
            if (terminated) {
                System.out.println("The executor was successfully stopped");
            } else {
                System.out.println("Timeout elapsed before termination");
            }
        } catch(InterruptedException e) {

        }
    }
}
