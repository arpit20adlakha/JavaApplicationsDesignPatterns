package com.company;

public abstract class fruit {
    private Integer number;
    private String color;
    private Integer weight;

    public fruit(int number, String color, Integer weight) {
        this.number = number;
        this.color = color;
        this.weight = weight;
    }

    abstract String getFruitType();

    protected Integer getNumberOfFruits() {
        return this.number;
    }

    protected String getColorOfFruit() {
        return this.color;
    }

    protected Integer getWeightOfFruit() {
        return this.weight;
    }

}
