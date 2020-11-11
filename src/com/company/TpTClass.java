package com.company;

public class TpTClass {
    public static void staticMethod() {
        // unsynchronized code

        synchronized (TpTClass.class) {
            // synchronized code
        }
    }


    public void instanceMethod() {
        // unsynchronized code

        synchronized (this) { // synchronization on this instance
            // synchronized code

        }
    }
}
