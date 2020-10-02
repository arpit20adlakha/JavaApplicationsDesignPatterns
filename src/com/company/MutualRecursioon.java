package com.company;

public class MutualRecursioon {
    public static boolean isOdd(int n) {
        if (n < 0) throw new IllegalArgumentException("Can't accept negatiove argymwents");
        return (n == 0)  ? false : isEven(n-1);
    }

    public static boolean isEven(int n){
        if (n < 0) throw new IllegalArgumentException("Can't accept negatiove argymwents");
        return (n == 0)  ? true : isOdd(n-1);
    }

}
