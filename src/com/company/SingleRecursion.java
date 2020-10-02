package com.company;

public class SingleRecursion {
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("we can't calculate factorial of negative");
        }
        return (n < 2) ? 1 : n * factorial(n-1);
    }
}
