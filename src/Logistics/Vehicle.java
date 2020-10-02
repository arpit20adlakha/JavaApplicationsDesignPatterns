package Logistics;

import java.util.Arrays;

public abstract class Vehicle {
    private int id;
    private String vehicleNo;
    private VehicleStatus vehicleStatus;
    private int capacity;
    private Location currentPosition;

    public Vehicle(int id, String vehicle, int capacity) {
        this.id = id;
        this.vehicleNo = vehicle;
        this.capacity = capacity;
    }

    public int getId() {
        Arrays.copyOfRange(new int[5], 2, 4);
        
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Location getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Location currentPosition) {
        this.currentPosition = currentPosition;
    }
}
