package org.example.coreprofessional;

/*  Write a method that takes as input a non-negative integer
and returns true if the number is a palindrome; otherwise, it returns false.
 Also write a program to test your method. */
public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        int num = 12321;
        System.out.println(num + " is palindrome? " + isPalindrome(num));
    }
}