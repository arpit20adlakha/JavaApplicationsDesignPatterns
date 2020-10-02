package Logistics;

class Bike extends Vehicle {
    private static final int capacity = 10;

    public Bike(int id, String vehicleNo) {
        super(id, vehicleNo, capacity);
    }
}
