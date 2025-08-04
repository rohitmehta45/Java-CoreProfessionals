/*
Write a program that would print the information (name, year of joining, salary, address)
of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/

package exercise2nd;

public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void display() {
        System.out.printf("%-10s %-18d %s%n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, 0, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, 0, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, 0, "26B- WallsStreat");

        System.out.println("Name       Year of joining       Address");
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
