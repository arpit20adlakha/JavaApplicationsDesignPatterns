package test;

import java.util.Scanner;

public class Address {
    private final String name;
    private final String street;

    public Address(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        s.toCharArray();
        return name;
    }

    public String getStreet() {
        return street;
    }

    public static void main(String[] args) {
        System.out.println(Address.class);

        Address address = new Address("Honh", "122 spartan lane");
    }
}
