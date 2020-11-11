package FactoryPattern.Motor;

import FactoryPattern.Motor.Motor;

public class PnuematicMotor extends Motor {
    public PnuematicMotor(String model , long power) {
       super(model, power);
    }
}

