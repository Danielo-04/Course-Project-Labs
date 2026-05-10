/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #3
 * Purpose: Main application demonstrating abstraction, constructors, and access specifiers.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Daniel Baez-Perez - Project Week 3");
        System.out.println("Vehicle Service Tracker");
        System.out.println();

        System.out.println("Welcome to the Vehicle Service Tracker!");
        System.out.println("This application demonstrates abstraction, constructors, and access specifiers.");
        System.out.println();

        Owner owner1 = new Owner("Alex Morgan", "555-123-4567");
        ServiceRecord service1 = new ServiceRecord("Brake Inspection", "05/09/2026");

        Car car1 = new Car("Honda", "Accord", 2021, owner1, 4, service1);

        // Polymorphism from Week 2 still works
        Displayable item = car1;

        System.out.println("Stored Vehicle Information:");
        System.out.println("---------------------------");
        System.out.println(item.getDisplayInfo());

        System.out.println();
        System.out.println("Default Constructor Example:");
        System.out.println("----------------------------");

        Car defaultCar = new Car();
        System.out.println(defaultCar.getDisplayInfo());
    }
}