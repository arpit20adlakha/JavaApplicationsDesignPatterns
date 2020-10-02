package com.company;

public class MultiRecursion {
    public static long fibonacci(long n) {
        if (n < 0) throw new IllegalArgumentException("Can't accept negative arguments");
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int numberof = 10;
        for(int i=0; i < numberof ;i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}
