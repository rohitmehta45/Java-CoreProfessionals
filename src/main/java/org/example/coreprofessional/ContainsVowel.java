package org.example.coreprofessional;

/*  Write a method that takes input string from the user and return
 true if it contains vowels otherwise false. */
public class ContainsVowel {
    public static boolean containsVowel(String str) {
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsVowel("hello"));
        System.out.println(containsVowel("rhythm"));
    }
}