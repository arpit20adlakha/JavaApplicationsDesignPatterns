package com.company;

public class Mango extends fruit{

    public Mango(int number, String color, Integer weight) {
        super(number, color, weight);
    }

    @Override
    String getFruitType() {
        return FruitType.MANGO.toString();
    }

}
