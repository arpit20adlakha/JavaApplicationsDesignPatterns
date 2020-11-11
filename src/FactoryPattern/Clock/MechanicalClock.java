package FactoryPattern.Clock;

public class MechanicalClock implements Clock {

    @Override
    public  void tick() {
        System.out.println("...clang mechanism");
    }
}
