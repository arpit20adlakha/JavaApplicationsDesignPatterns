package com.company;

@FunctionalInterface
public interface Func<T, R> {
    R apply(T val);

    static void doNothingStatic() {

    }

    default void doNothingByDefault() {

    }
}
