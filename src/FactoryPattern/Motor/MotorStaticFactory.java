package FactoryPattern.Motor;

public class MotorStaticFactory {

    public static Motor make(char type, String model, long power) {
        Character c = Character.toUpperCase(type);

        switch(c) {
            case 'P':
                return new PnuematicMotor(model, power);
            case 'H':
                return new HydraulicMotor(model, power);
            case 'E':
                return new ElectricMotor(model, power);
            case 'W':
                return new WarpDrive(model, power);
            default:
                return null;
        }
    }
}
