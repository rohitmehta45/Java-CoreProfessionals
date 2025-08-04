package org.example.coreprofessional;/* WAP that displays all the odd numbers from range
void displayOddNumbers(int start , int end)
 */

public class OddNumberDisplay {

    public static void displayOddNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        displayOddNumbers(1, 20);
    }
}

