/*Write a program with a method named getTotal that
accepts two integers as an argument and return its sum.
Call this method from main( ) and print the results.
 */


public class TotalSum {

    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = getTotal(5, 10);
        System.out.println("The sum is: " + result);
    }
}
