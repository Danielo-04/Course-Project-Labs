/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #1
 * Purpose: Base class that stores general vehicle information.
 */

public class Vehicle {
    private String make;
    private String model;
    private int year;

    // Composition: Vehicle has an Owner object
    private Owner owner;

    public Vehicle(String make, String model, int year, Owner owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public String toString() {
        return "Vehicle: " + year + " " + make + " " + model + "\n" + owner;
    }
}