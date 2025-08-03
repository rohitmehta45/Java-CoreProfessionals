/*Write a program to print the factorial of a number by
defining a method getFactorial(int number).
 */

import java.util.Scanner;

public class FactorialCalculator {

    public static long getFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long result = getFactorial(num);

        System.out.println("Factorial of " + num + " is: " + result);
    }
}
