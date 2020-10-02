package Logistics;

public class Truck extends Vehicle {

    private static final int capacityOfTruck = 100;

    public Truck(int id, String vehicleNo) {
        super(id, vehicleNo, capacityOfTruck);
    }

}
