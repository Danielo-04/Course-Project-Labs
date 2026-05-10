/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #2
 * Purpose: Main application demonstrating interfaces and polymorphism.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Daniel Baez-Perez - Project Week 2");
        System.out.println("Vehicle Service Tracker");
        System.out.println();

        System.out.println("Welcome to the Vehicle Service Tracker!");
        System.out.println("This application demonstrates interfaces and polymorphism.");
        System.out.println();

        Owner owner1 = new Owner("Alex Morgan", "555-123-4567");
        ServiceRecord service1 = new ServiceRecord("Oil Change", "05/09/2026");

        Car car1 = new Car(
                "Toyota",
                "Camry",
                2020,
                owner1,
                4,
                service1
        );

        // Polymorphism demonstration
        Displayable item = car1;

        System.out.println("Stored Vehicle Information:");
        System.out.println("---------------------------");
        System.out.println(item.getDisplayInfo());
    }
}