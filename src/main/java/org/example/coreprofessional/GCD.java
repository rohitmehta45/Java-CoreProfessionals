package org.example.coreprofessional;

/*  Write a method to find gcd using recursion. */
public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println("org.example.coreprofessional.GCD of 48 and 18 is " + gcd(48, 18));
    }
}