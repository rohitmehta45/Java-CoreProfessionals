package org.example.coreprofessional.ClassWorkDay3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataSource {

    public List<Employee> readEmployeeData(String filename) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                // Skip the header line
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                // Parse the employee data
                Employee employee = parseEmployeeLine(line);
                if (employee != null) {
                    employees.add(employee);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return employees;
    }

    private Employee parseEmployeeLine(String line) {
        try {

            String[] parts = line.split("\t");

            if (parts.length >= 7) {
                String fullName = parts[0].trim();
                String address = parts[1].trim();
                String email = parts[2].trim();
                String mobileNumber = parts[3].trim();
                String department = parts[4].trim();
                double salary = Double.parseDouble(parts[5].trim());
                int yearsOfExperience = Integer.parseInt(parts[6].trim());

                return new Employee(fullName, address, email, mobileNumber, department, salary, yearsOfExperience);
            }
        } catch (NumberFormatException e) {
            System.err.println("Error parsing numeric values: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error parsing line: " + line + " - " + e.getMessage());
        }

        return null;
    }
}
