/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #3
 * Purpose: Child class representing a car.
 */

public class Car extends Vehicle {
    // Private because this data only belongs to Car
    private int numberOfDoors;

    // Composition: Car has a ServiceRecord object
    private ServiceRecord serviceRecord;

    // Default constructor
    public Car() {
        super();
        this.numberOfDoors = 4;
        this.serviceRecord = new ServiceRecord();
    }

    // Parameterized constructor
    public Car(String make, String model, int year, Owner owner,
               int numberOfDoors, ServiceRecord serviceRecord) {
        super(make, model, year, owner);
        this.numberOfDoors = numberOfDoors;
        this.serviceRecord = serviceRecord;
    }

    // Abstraction: required because Vehicle has an abstract method
    @Override
    public String getVehicleType() {
        return "Car";
    }

    @Override
    public String getDisplayInfo() {
        return super.getDisplayInfo()
                + "\nNumber of Doors: " + numberOfDoors
                + "\n" + serviceRecord;
    }
}