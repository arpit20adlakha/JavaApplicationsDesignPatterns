package com.company;

public class MyCounter {
    private int count = 0;

    public synchronized void add(int value) {
        this.count += value;
    }
}
