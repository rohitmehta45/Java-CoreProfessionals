/*WAP that displays all the numbers from range void display
(int start , int end)
 */

public class RangeDisplay {

    public static void display(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        display(1, 10);
    }
}
