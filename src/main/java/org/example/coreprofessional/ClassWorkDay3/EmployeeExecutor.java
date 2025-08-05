package org.example.coreprofessional.ClassWorkDay3;

import java.util.List;

public class EmployeeExecutor {
    public static void main(String[] args) {
        EmployeeDataSource dataSource = new EmployeeDataSource();
        EmployeeUtils utils = new EmployeeUtils();

        // Full path to employee_data.txt
        String filename = "C:\\Users\\acer\\JAVA\\coreProfessional\\src\\main\\java\\org\\example\\coreprofessional\\ClassWorkDay3\\employee_data.txt";

        List<Employee> employees = dataSource.readEmployeeData(filename);

        if (employees.isEmpty()) {
            System.out.println("No employee data found or error reading file.");
            return;
        }
        System.out.println("=== Employee Data Analysis ===\n");
        System.out.println("Total employees loaded: " + employees.size() + "\n");

        // 1. Find employee with highest salary
        Employee highestSalaryEmployee = utils.findEmployeeWithHighestSalary(employees);
        if (highestSalaryEmployee != null) {
            System.out.println("1. Employee with Highest Salary:");
            System.out.println("   Name: " + highestSalaryEmployee.getFullName());
            System.out.println("   Salary: $" + String.format("%.2f", highestSalaryEmployee.getSalary()));
            System.out.println("   Department: " + highestSalaryEmployee.getDepartment());
            System.out.println();
        }

        // 2. Find employee with lowest salary
        Employee lowestSalaryEmployee = utils.findEmployeeWithLowestSalary(employees);
        if (lowestSalaryEmployee != null) {
            System.out.println("2. Employee with Lowest Salary:");
            System.out.println("   Name: " + lowestSalaryEmployee.getFullName());
            System.out.println("   Salary: $" + String.format("%.2f", lowestSalaryEmployee.getSalary()));
            System.out.println("   Department: " + lowestSalaryEmployee.getDepartment());
            System.out.println();
        }

        // 3. Find employees with more than 10 years of experience
        List<Employee> experiencedEmployees = utils.findEmployeesWithMoreThan10YearsExperience(employees);
        System.out.println("3. Employees with More Than 10 Years of Experience (" + experiencedEmployees.size() + " employees):");
        for (Employee emp : experiencedEmployees) {
            System.out.println("   - " + emp.getFullName() + " (" + emp.getYearsOfExperience() + " years)");
        }
        System.out.println();

        // 4. Find employees whose name contains all vowels
        List<Employee> vowelEmployees = utils.findEmployeesWithAllVowelsInName(employees);
        System.out.println("4. Employees with All Vowels in Name (" + vowelEmployees.size() + " employees):");
        for (Employee emp : vowelEmployees) {
            System.out.println("   - " + emp.getFullName());
        }
        System.out.println();

        // 5. Calculate total salary
        double totalSalary = utils.calculateTotalSalary(employees);
        System.out.println("5. Total Salary of All Employees:");
        System.out.println("   $" + String.format("%.2f", totalSalary));
        System.out.println();
    }
}
