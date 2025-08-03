/* Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
Expected output:
Input a year: 2017
false
*/
public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        System.out.println("2017 is leap year? " + isLeapYear(2017));
    }
}