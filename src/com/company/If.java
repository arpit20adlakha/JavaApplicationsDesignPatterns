package com.company;

import java.security.spec.ECField;

public interface If extends Extra, Runnable{

    int INT_CONSTANT = 0;

    private  void instanceMethod1()  {
        System.out.println("hoopla");
    };

    static void moono() {
        System.out.println("choople");
    }

    public void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface default method . It can be overridden");
    }
}
