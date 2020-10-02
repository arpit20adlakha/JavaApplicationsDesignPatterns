package VehicularAbstraction;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new MotorBike();
        doDrive(car);
        doDrive(bike);

    }

    public static void doDrive(Vehicle vehicle) {
        vehicle.drive();
        System.out.println(vehicle.getNoOfWheels());
    }


}
