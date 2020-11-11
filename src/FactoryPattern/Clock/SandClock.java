package FactoryPattern.Clock;

public class SandClock implements Clock {

    @Override
    public void tick() {
        System.out.println(".... sand noise ....");
    }
}
