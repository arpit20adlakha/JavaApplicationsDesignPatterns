package VehicularAbstraction;

public class MotorBike extends Vehicle{
    public MotorBike() {
        super(2);
    }

    @Override
    public void drive() {
        System.out.println("Use handlebars");
    }
}
