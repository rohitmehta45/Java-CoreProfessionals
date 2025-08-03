/* Define two methods to print the maximum and minimum number
 respectively among three numbers entered by the user.
 */

import java.util.Scanner;

public class MinMaxFinder {

    public static void printMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        System.out.println("Maximum number: " + max);
    }

    public static void printMinimum(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;
        System.out.println("Minimum number: " + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        printMaximum(n1, n2, n3);
        printMinimum(n1, n2, n3);
    }
}



