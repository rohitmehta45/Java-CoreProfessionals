/* 16. Write a program in java to check armstrong and perfect numbers using the function.
Test Data :
Input any number: 371
Expected Output :
The 371 is an Armstrong number.
The 371 is not a Perfect number.
*/

package org.example.coreprofessional;
public class NumberCheck {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        int digits = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int n = 371;
        System.out.println("The " + n + " is an Armstrong number? " + isArmstrong(n));
        System.out.println("The " + n + " is a Perfect number? " + isPerfect(n));
    }
}
