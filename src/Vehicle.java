/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #3
 * Purpose: Abstract base class for vehicle information.
 */

// Abstraction: Vehicle is abstract because a generic vehicle should not be created directly
public abstract class Vehicle implements Displayable {
    // Protected allows child classes to access these fields
    protected String make;
    protected String model;
    protected int year;

    // Composition: Vehicle has an Owner object
    private Owner owner;

    // Default constructor
    public Vehicle() {
        this.make = "Unknown Make";
        this.model = "Unknown Model";
        this.year = 0;
        this.owner = new Owner();
    }

    // Parameterized constructor
    public Vehicle(String make, String model, int year, Owner owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    // Abstract method forces child classes to define vehicle type
    public abstract String getVehicleType();

    public String getOwnerInfo() {
        return owner.toString();
    }

    @Override
    public String getDisplayInfo() {
        return "Vehicle Type: " + getVehicleType()
                + "\nVehicle: " + year + " " + make + " " + model
                + "\n" + getOwnerInfo();
    }
}