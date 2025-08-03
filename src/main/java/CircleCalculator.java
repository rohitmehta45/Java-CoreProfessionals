/*Write a program to print the circumference and area of a circle
of radius entered by the user by defining your own method.
 */


import java.util.Scanner;

public class CircleCalculator {

    public static double calculateCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius (integer): ");
        int radius = scanner.nextInt();

        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
