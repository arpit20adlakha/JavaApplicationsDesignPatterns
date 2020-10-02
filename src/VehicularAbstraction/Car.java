package VehicularAbstraction;

public class Car extends Vehicle {

    public Car() {
        super(4);
    }

    @Override
    public void drive() {
        System.out.println("Use steering wheel");
    }
}
