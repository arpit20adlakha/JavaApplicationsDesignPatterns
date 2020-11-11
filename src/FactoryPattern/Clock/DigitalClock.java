package FactoryPattern.Clock;

public class DigitalClock implements Clock{
    @Override
    public void tick() {
        System.out.println("...pim...");
    }
}
