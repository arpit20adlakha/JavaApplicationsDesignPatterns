package com.company;

public enum VehicleType {
    CAR(1), BIKE(2), SCOOTER(3);
    int value;

    VehicleType (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
