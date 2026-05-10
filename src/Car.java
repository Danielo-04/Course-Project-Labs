/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #1
 * Purpose: Child class that extends Vehicle and stores car-specific information.
 */

public class Car extends Vehicle {
    private int numberOfDoors;

    // Composition: Car has a ServiceRecord object
    private ServiceRecord serviceRecord;

    // Inheritance: Car extends Vehicle
    public Car(String make, String model, int year, Owner owner, int numberOfDoors, ServiceRecord serviceRecord) {
        super(make, model, year, owner);
        this.numberOfDoors = numberOfDoors;
        this.serviceRecord = serviceRecord;
    }

    public String toString() {
        return super.toString() +
               "\nNumber of Doors: " + numberOfDoors +
               "\n" + serviceRecord;
    }
}