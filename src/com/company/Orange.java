package com.company;


final class Orange extends fruit {

    private static Orange instance;
    public static synchronized Orange getInstance(Integer number, String color, Integer weight) {
        System.out.println("getInstance called");
        if (instance == null) {
            System.out.println("Object was null");
           return instance =  new Orange(number, color, weight);
        } else {
            return instance;
        }
    }

    private Orange(Integer number, String color, Integer weight) {
        super(number, color, weight);
    }

    @Override
    String getFruitType() {
        return FruitType.ORANGE.toString();
    }



}
