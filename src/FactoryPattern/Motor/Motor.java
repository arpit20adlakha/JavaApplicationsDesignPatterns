package FactoryPattern.Motor;

public abstract class Motor {
    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }
}
