/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #2
 * Purpose: Represents a vehicle service record.
 */

public class ServiceRecord {
    private String serviceType;
    private String serviceDate;

    public ServiceRecord(String serviceType, String serviceDate) {
        this.serviceType = serviceType;
        this.serviceDate = serviceDate;
    }

    @Override
    public String toString() {
        return "Service Type: " + serviceType + "\nService Date: " + serviceDate;
    }
}