package org.example.coreprofessional;

/*  Write a method to find factorial using recursion. */
public class Factorial {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + factorial(5));
    }
}