/*Create a function called sum(int num1 , int num2 , int num3)
and inside the function return the sum of three numbers and display
it in the part from where the function was called.
 */

public class SumCalculator {

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int result = sum(10, 20, 30);
        System.out.println("Sum of the numbers: " + result);
    }
}
