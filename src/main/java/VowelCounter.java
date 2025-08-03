/*  Write a value-returning method, isVowel that returns the value true
if a given character is a vowel, and otherwise returns false. In main() method
accept a string from the user and count the number of vowels in that string. */
import java.util.Scanner;
public class VowelCounter {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
