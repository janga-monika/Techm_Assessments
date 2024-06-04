package com.backend;

import java.sql.*;
import java.util.Scanner;

public class EmployeeManagement {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Companydb";
    private static final String USER = "root";
    private static final String PASS = "Monika@3";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            while (true) {
                System.out.println("Enter 1 to Insert, 2 to Delete, 3 to View All, 4 to View By ID, 0 to Exit:");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertEmployee(scanner, conn);
                        break;
                    case 2:
                        deleteEmployee(scanner, conn);
                        break;
                    case 3:
                        viewAllEmployees(conn);
                        break;
                    case 4:
                        viewEmployeeById(scanner, conn);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void insertEmployee(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();

        String query = "INSERT INTO Employee (empId, empName, salary) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, empId);
            pstmt.setString(2, empName);
            pstmt.setInt(3, salary);
            pstmt.executeUpdate();
            System.out.println("Employee inserted successfully.");
        }
    }

    private static void deleteEmployee(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("Enter Employee ID to Delete: ");
        int empId = scanner.nextInt();

        String query = "DELETE FROM Employee WHERE empId = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, empId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    private static void viewAllEmployees(Connection conn) throws SQLException {
        String query = "SELECT * FROM Employee";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("empId") + ", Name: " + rs.getString("empName") + ", Salary: " + rs.getInt("salary"));
            }
        }
    }

    private static void viewEmployeeById(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("Enter Employee ID to View: ");
        int empId = scanner.nextInt();

        String query = "SELECT * FROM Employee WHERE empId = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, empId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("empId") + ", Name: " + rs.getString("empName") + ", Salary: " + rs.getInt("salary"));
                } else {
                    System.out.println("Employee not found.");
                }
            }
        }
    }
}
