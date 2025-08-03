/* Create a function that returns true when both the parameters
 are equal else return false. isSameNum(4, 8) ➞ false
 */

public class NumberComparator {

    public static boolean Num(int num1, int num2) {
        return num1 == num2;
    }

    public static void main(String[] args) {
        System.out.println(Num(4, 8));
        System.out.println(Num(5, 5));
    }
}
