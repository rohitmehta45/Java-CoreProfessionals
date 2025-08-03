/*WAP to check whether a number is even or odd using function.
The function name should be isEven(int parameter), which returns
true if the number is even and return false if the number is  odd.
 */

public class EvenOddChecker {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 7;
        boolean result = isEven(num);

        if (result) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
