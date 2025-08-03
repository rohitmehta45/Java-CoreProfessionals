/* WAP that displays all the prime numbers between 1 and 1000.
Use the above checkPrime function to identify the prime number.
 */

public class PrimeRange {

    public static boolean checkPrime(int testNumber) {
        if (testNumber <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(testNumber); i++) {
            if (testNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
