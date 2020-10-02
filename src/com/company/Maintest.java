package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

@SuppressWarnings("unchecked")
public class Maintest {

    public static void main(String[] args) {
        final String hello = "Hello";
        Function<String, String> helloFunction = (name) -> hello + name;
        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));

        int constant = 100;
        int top = constant;

        Function<Integer, Integer> adder1 = x -> x + top;
        System.out.println(adder1.apply(20));

        constant = 200;
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        Function<Integer, Integer> idetity = x -> x;
        Function<Integer, Integer> identity2 = (x) -> x;
        Function<Integer, Integer> mult = (Integer x) -> x * 2;

        Function<Integer, Integer> adder = (x) -> {
            x += 5;
            x += 10;
            return x;
        };

        Function<Integer, Integer> f = (x) -> x + 1;
        acceptFunctionalInterface(f);
        acceptFunctionalInterface((x)  -> x + 1);
        Function<Integer, Integer> mytype = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return null;
            }
        };

        Door door = new Door("main", 23);
        System.out.println(door.getAge());
        System.out.println(door.getName());
    }

    public static void acceptFunctionalInterface(Function<Integer, Integer> f) {
        System.out.println(f.apply(10));
    }
}
