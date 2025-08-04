package org.example.coreprofessional;/*Define a method that returns the product of two numbers
entered by the user.
 */

import java.util.Scanner;

public class ProductByUser {
    public static int getProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int product = getProduct(num1, num2);

        System.out.println("The product is: " + product);
    }
}
