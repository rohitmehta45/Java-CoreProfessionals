/* 13. Write a program with a method named getTotal that accepts two integers as an argument
and return its sum. Call this method from main( ) and print the results. */

package org.example.coreprofessional;
public class TotalCalculator {
    public static int getTotal(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Total is: " + getTotal(10, 20));
    }
}
