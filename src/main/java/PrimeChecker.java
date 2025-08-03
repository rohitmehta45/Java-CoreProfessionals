/* WAP that check a prime number boolean checkPrime(int testNumber)  */

public class PrimeChecker {

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
        int num = 17;
        if (checkPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

