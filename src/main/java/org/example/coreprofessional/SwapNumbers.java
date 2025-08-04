/* 14. Write a program in java to swap two numbers using a function. */

package org.example.coreprofessional;
public class SwapNumbers {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap(x, y);
    }
}
