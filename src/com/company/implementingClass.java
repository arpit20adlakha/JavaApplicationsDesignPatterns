package com.company;

import java.util.Collections;

public class implementingClass extends Person implements If, Comparable<Integer> {

//    @Override
//    public void instanceMethod1() {
//        System.out.println("I am overriding method 1");
//    }

    @Override
    public void instanceMethod2() {
        System.out.println("I am overriding method 2");
    }

    @Override
    public void run() {

    }

    @Override
    public int compareTo(Integer integer) {
        return 0;
    }
}
