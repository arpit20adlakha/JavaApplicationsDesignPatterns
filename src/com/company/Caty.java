package com.company;

public class Caty extends Pet {
    public Caty(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Meow!");
    }

}


