/* Assign and print the roll number, phone number and address of two
 students having names "Sam" and "John" respectively by creating two
 objects of class 'Student'.
 */

package org.example.coreprofessional.exercise2nd;
public class Studentdtls {
    String name;
    int rollNo;
    String phoneNumber;
    String address;

    public void setDetails(String name, int rollNo, String phoneNumber, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        Studentdtls student1 = new Studentdtls();
        student1.setDetails("Sam", 1, "9800000001", "Kathmandu");

        Studentdtls student2 = new Studentdtls();
        student2.setDetails("John", 2, "9800000002", "Pokhara");

        student1.displayDetails();
        student2.displayDetails();
    }
}
