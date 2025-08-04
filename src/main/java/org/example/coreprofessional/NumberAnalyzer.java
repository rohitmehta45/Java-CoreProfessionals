package org.example.coreprofessional;/*Create a function called averageNumber(int num1 , int num2 , int num3)
  and inside the function display the highest and lowest among three numbers.
 */

public class NumberAnalyzer {

    public static void averageNumber(int num1, int num2, int num3) {
        int highest = num1;
        int lowest = num1;

        if (num2 > highest) {
            highest = num2;
        }
        if (num3 > highest) {
            highest = num3;
        }

        if (num2 < lowest) {
            lowest = num2;
        }
        if (num3 < lowest) {
            lowest = num3;
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }

    public static void main(String[] args) {
        averageNumber(15, 42, 7);
    }
}
