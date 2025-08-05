/*
Print the average of three numbers entered by the user by creating a class named 'Average'
having a method to calculate and print the average.
*/

package org.example.coreprofessional.exercise2nd;

import java.util.Scanner;

public class Average {
    private double num1, num2, num3;

    public Average(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void calculateAndPrintAverage() {
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = scanner.nextDouble();

        Average avg = new Average(n1, n2, n3);
        avg.calculateAndPrintAverage();
    }
}
