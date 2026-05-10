/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #3
 * Purpose: Represents the owner of a vehicle.
 */

public class Owner {
    // Private access specifiers protect data from direct outside access
    private String name;
    private String phoneNumber;

    // Default constructor
    public Owner() {
        this.name = "Unknown Owner";
        this.phoneNumber = "000-000-0000";
    }

    // Parameterized constructor
    public Owner(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Owner Name: " + name + "\nPhone Number: " + phoneNumber;
    }
}