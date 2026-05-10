/*
 * Name: Daniel Baez-Perez
 * Date: May 9, 2026
 * Assignment: SDC330 Project Phase #4
 * Purpose: Handles SQLite database creation and CRUD operations for vehicle records.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicleDatabase {
    private final String databaseUrl = "jdbc:sqlite:vehicles.db";

    public VehicleDatabase() {
        createTable();
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(databaseUrl);
    }

    public void createTable() {
        String sql =
            "CREATE TABLE IF NOT EXISTS vehicles ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "ownerName TEXT NOT NULL, "
            + "make TEXT NOT NULL, "
            + "model TEXT NOT NULL, "
            + "year INTEGER NOT NULL, "
            + "serviceType TEXT NOT NULL, "
            + "serviceDate TEXT NOT NULL"
            + ");";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Database table is ready.");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    // CREATE: Adds a new vehicle record
    public void addVehicle(String ownerName, String make, String model, int year,
                           String serviceType, String serviceDate) {
        String sql =
            "INSERT INTO vehicles(ownerName, make, model, year, serviceType, serviceDate) "
            + "VALUES (?, ?, ?, ?, ?, ?);";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ownerName);
            pstmt.setString(2, make);
            pstmt.setString(3, model);
            pstmt.setInt(4, year);
            pstmt.setString(5, serviceType);
            pstmt.setString(6, serviceDate);

            pstmt.executeUpdate();
            System.out.println("Vehicle record added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding vehicle: " + e.getMessage());
        }
    }

    // READ: Displays all vehicle records
    public void displayVehicles() {
        String sql = "SELECT * FROM vehicles;";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println();
            System.out.println("Vehicle Records");
            System.out.println("---------------");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Owner: " + rs.getString("ownerName"));
                System.out.println("Vehicle: " + rs.getInt("year") + " "
                        + rs.getString("make") + " " + rs.getString("model"));
                System.out.println("Service: " + rs.getString("serviceType"));
                System.out.println("Service Date: " + rs.getString("serviceDate"));
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Error displaying vehicles: " + e.getMessage());
        }
    }

    // UPDATE: Updates the service type for one vehicle
    public void updateServiceType(int id, String newServiceType) {
        String sql = "UPDATE vehicles SET serviceType = ? WHERE id = ?;";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newServiceType);
            pstmt.setInt(2, id);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Vehicle service record updated successfully.");
            } else {
                System.out.println("No vehicle found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error updating vehicle: " + e.getMessage());
        }
    }

    // DELETE: Deletes one vehicle record
    public void deleteVehicle(int id) {
        String sql = "DELETE FROM vehicles WHERE id = ?;";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Vehicle record deleted successfully.");
            } else {
                System.out.println("No vehicle found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error deleting vehicle: " + e.getMessage());
        }
    }
}