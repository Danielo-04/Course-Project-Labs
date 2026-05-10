/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #2
 * Purpose: Represents the owner of a vehicle.
 */

public class Owner {
    private String name;
    private String phoneNumber;

    public Owner(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Owner Name: " + name + "\nPhone Number: " + phoneNumber;
    }
}