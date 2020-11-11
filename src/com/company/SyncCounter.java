package com.company;

public class SyncCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getValue() {
        return count;
    }
}
