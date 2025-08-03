import java.util.Scanner;

public class Calculator19 {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        int result = sum(n1, n2);
        System.out.println("Sum: " + result);
    }
}
