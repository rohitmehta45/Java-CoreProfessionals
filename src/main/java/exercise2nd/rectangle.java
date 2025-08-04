/*
Write a program to print the area of a rectangle by creating a class named rectangle having two methods.
First method named as 'setDim' takes length and breadth of the rectangle as parameters and the second
method named as 'getArea' returns the area of the rectangle. Length and breadth of the rectangle are
entered through the keyboard.
*/

package exercise2nd;

import java.util.Scanner;

public class rectangle {
    private double length, breadth;

    public void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double len = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double brd = scanner.nextDouble();

        rectangle rect = new rectangle();
        rect.setDim(len, brd);
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}

