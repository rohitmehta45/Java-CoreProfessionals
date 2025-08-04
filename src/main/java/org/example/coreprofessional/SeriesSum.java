/* 15. Write a program in java to find the sum of the series
 1!/1+2!/2+3!/3+4!/4+5!/5 using the function. */

package org.example.coreprofessional;
public class SeriesSum {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static double sumSeries(int terms) {
        double sum = 0;
        for (int i = 1; i <= terms; i++) {
            sum += (double) factorial(i) / i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of series: " + sumSeries(5));
    }
}