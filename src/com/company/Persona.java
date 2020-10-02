package com.company;

public class Persona {
    private String name;
    private Passport passport;

    public Persona(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{name=" + name + ",passport=" + passport + "}";
    }
}
