/*
Write a program to print the area of a rectangle by creating a class named 'Area' taking the
values of its length and breadth as parameters of its constructor and having a method named
'returnArea' which returns the area of the rectangle. Length and breadth of the rectangle are
entered through the keyboard.
*/

package exercise2nd;

import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Area rectangle = new Area(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.returnArea());
    }
}
