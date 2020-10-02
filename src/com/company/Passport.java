package com.company;
import java.time.LocalTime;

public class Passport {
    private String country;
    private String number;
    private Persona owner;
    private LocalTime localTime;

    public Passport(String country, String number) {
        this.country = country;
        this.number = number;
    }
    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Passport{country=" + country + ",number=" + number + ", owner=" + owner + "}";
    }

    public static void main(String[] args) {
        Passport passport = new Passport("India", "2224");
        Persona persona = new Persona("hiraku", passport);
        passport.setOwner(persona);
        System.out.println(persona);
    }

}
