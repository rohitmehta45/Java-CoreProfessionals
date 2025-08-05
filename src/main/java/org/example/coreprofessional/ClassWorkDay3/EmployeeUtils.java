package org.example.coreprofessional.ClassWorkDay3;

import java.util.List;
import java.util.ArrayList;

public class EmployeeUtils {

    public Employee findEmployeeWithHighestSalary(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return null;
        }

        Employee highestSalaryEmployee = employees.get(0);

        for (Employee employee : employees) {
            if (employee.getSalary() > highestSalaryEmployee.getSalary()) {
                highestSalaryEmployee = employee;
            }
        }

        return highestSalaryEmployee;
    }

    public Employee findEmployeeWithLowestSalary(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return null;
        }

        Employee lowestSalaryEmployee = employees.get(0);

        for (Employee employee : employees) {
            if (employee.getSalary() < lowestSalaryEmployee.getSalary()) {
                lowestSalaryEmployee = employee;
            }
        }

        return lowestSalaryEmployee;
    }

    public List<Employee> findEmployeesWithMoreThan10YearsExperience(List<Employee> employees) {
        List<Employee> experiencedEmployees = new ArrayList<>();

        if (employees == null || employees.isEmpty()) {
            return experiencedEmployees;
        }

        for (Employee employee : employees) {
            if (employee.isExperienced()) {
                experiencedEmployees.add(employee);
            }
        }

        return experiencedEmployees;
    }

    public List<Employee> findEmployeesWithAllVowelsInName(List<Employee> employees) {
        List<Employee> vowelEmployees = new ArrayList<>();

        if (employees == null || employees.isEmpty()) {
            return vowelEmployees;
        }

        for (Employee employee : employees) {
            if (employee.hasAllVowelsInName()) {
                vowelEmployees.add(employee);
            }
        }

        return vowelEmployees;
    }

    public double calculateTotalSalary(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return 0.0;
        }

        double totalSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }

    public double calculateAverageSalary(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return 0.0;
        }

        double totalSalary = calculateTotalSalary(employees);
        return totalSalary / employees.size();
    }

    public void printDepartmentCounts(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return;
        }

        int itSupportCount = 0;
        int hrCount = 0;
        int engineeringCount = 0;
        int salesCount = 0;
        int financeCount = 0;
        int marketingCount = 0;

        for (Employee employee : employees) {
            String department = employee.getDepartment();

            switch (department) {
                case "IT Support":
                    itSupportCount++;
                    break;
                case "HR":
                    hrCount++;
                    break;
                case "Engineering":
                    engineeringCount++;
                    break;
                case "Sales":
                    salesCount++;
                    break;
                case "Finance":
                    financeCount++;
                    break;
                case "Marketing":
                    marketingCount++;
                    break;
            }
        }

        System.out.println("IT Support Employees: " + itSupportCount);
        System.out.println("HR Employees: " + hrCount);
        System.out.println("Engineering Employees: " + engineeringCount);
        System.out.println("Sales Employees: " + salesCount);
        System.out.println("Finance Employees: " + financeCount);
        System.out.println("Marketing Employees: " + marketingCount);
    }
}
