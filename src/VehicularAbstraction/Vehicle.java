package VehicularAbstraction;


public abstract class Vehicle {
    private int noOfWheels;

    /**
     *
     * @param noOfWheels Number of wheels of this vehicle
     */

    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    /*
    Implementation of drive method is unknown
     */
    public abstract void drive();

    public int getNoOfWheels() {
        return noOfWheels;
    }
}
