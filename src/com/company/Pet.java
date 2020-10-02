package com.company;

public abstract class Pet {

    protected String name;
    protected int age;

    protected Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void say();

    private void soupy() {
        System.out.println("soupy is called");
    }

}
