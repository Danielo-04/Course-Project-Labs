/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #3
 * Purpose: Represents a vehicle service record.
 */

public class ServiceRecord {
    // Private fields limit access to this class only
    private String serviceType;
    private String serviceDate;

    // Default constructor
    public ServiceRecord() {
        this.serviceType = "General Inspection";
        this.serviceDate = "01/01/2026";
    }

    // Parameterized constructor
    public ServiceRecord(String serviceType, String serviceDate) {
        this.serviceType = serviceType;
        this.serviceDate = serviceDate;
    }

    public String toString() {
        return "Service Type: " + serviceType + "\nService Date: " + serviceDate;
    }
}