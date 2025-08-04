package org.example.coreprofessional;/* 10. Write a Java method to check whether a string is a valid password
org.example.coreprofessional.Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
org.example.coreprofessional.Password is valid: abcd1234
*/
import java.util.Scanner;
public class Password {
    public static boolean isValidPassword(String password) {
        if (password.length() < 10) return false;
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;
            if (Character.isDigit(ch)) digitCount++;
        }
        return digitCount >= 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a password: ");
        String pwd = sc.nextLine();
        if (isValidPassword(pwd)) {
            System.out.println("org.example.coreprofessional.Password is valid: " + pwd);
        } else {
            System.out.println("org.example.coreprofessional.Password is invalid.");
        }
    }
}
