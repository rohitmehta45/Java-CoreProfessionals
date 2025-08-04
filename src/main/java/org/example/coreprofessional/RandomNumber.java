package org.example.coreprofessional;/*  Write a method to generate a random number. */
import java.util.Random;
public class RandomNumber {
    public static int generateRandom(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {
        System.out.println("Random number between 1 and 100: " + generateRandom(1, 100));
    }
}