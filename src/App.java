/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #4
 * Purpose: Main application demonstrating SQLite database CRUD operations.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Daniel Baez-Perez - Project Week 4");
        System.out.println("Vehicle Service Tracker");
        System.out.println();

        System.out.println("Welcome to the Vehicle Service Tracker!");
        System.out.println("This application stores vehicle service data in a SQLite database.");
        System.out.println("The program demonstrates Create, Read, Update, and Delete operations.");
        System.out.println();

        VehicleDatabase database = new VehicleDatabase();

        // CREATE
        database.addVehicle("Alex Morgan", "Honda", "Accord", 2021, "Brake Inspection", "05/09/2026");
        database.addVehicle("Jordan Lee", "Toyota", "Camry", 2020, "Oil Change", "05/10/2026");

        // READ
        database.displayVehicles();

        // UPDATE
        database.updateServiceType(1, "Tire Rotation");

        // READ after update
        database.displayVehicles();

        // DELETE
        database.deleteVehicle(2);

        // READ after delete
        database.displayVehicles();
    }
}