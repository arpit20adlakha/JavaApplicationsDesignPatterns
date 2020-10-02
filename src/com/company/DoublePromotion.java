package com.company;

public class DoublePromotion extends Promotion {

    DoublePromotion() {
        super(new Salary(1000));
    }

    protected void sayHello() {
        System.out.println("Hello from subclass");
    }
//
//
//    static public void promote() {
//
//    }
}
