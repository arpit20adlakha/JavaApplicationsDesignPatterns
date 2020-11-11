package FactoryPattern.Clock;

public class ToyClock implements Clock {

    @Override
    public void tick() {
        System.out.println("... tick...");
    }
}
