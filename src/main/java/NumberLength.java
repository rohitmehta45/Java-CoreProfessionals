/* WAP a java program that takes a number and returns the length
of the number.
 */

public class NumberLength {

    public static int getLength(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) {
        int num = 12345;
        int length = getLength(num);
        System.out.println("Length of the number is: " + length);
    }
}
