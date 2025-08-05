package org.example.coreprofessional.ClassWorkDay3;

public class Employee {
    private String fullName;
    private String address;
    private String email;
    private String mobileNumber;
    private String department;
    private double salary;
    private int yearsOfExperience;

    public Employee(String fullName, String address, String email, String mobileNumber,
                    String department, double salary, int yearsOfExperience) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isExperienced() {
        return yearsOfExperience > 10;
    }

    public boolean isHighEarner() {
        return salary > 100000;
    }

    public boolean hasAllVowelsInName() {
        String lowerName = fullName.toLowerCase();
        return lowerName.contains("a") &&
                lowerName.contains("e") &&
                lowerName.contains("i") &&
                lowerName.contains("o") &&
                lowerName.contains("u");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}