/* WAP to print the multiplication table of a number
using a function printMultiplication(int inputNumber)
 */


public class MultiplicationTable {

    public static void printMultiplication(int inputNumber) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " x " + i + " = " + (inputNumber * i));
        }
    }

    public static void main(String[] args) {
        printMultiplication(5);
    }
}
