/* Write Java methods to calculate the area of a triangle.
Expected Output:
Input Side-1: 10
Input Side-2: 15
Input Side-3: 20
The area of the triangle is 72.6184377413890
*/
package org.example.coreprofessional;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();


        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("Invalid triangle sides.");
        }

        sc.close();
    }
}
