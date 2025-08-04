package org.example.coreprofessional;

import java.util.Scanner;
/* import java.util.Scanner;

public class GradeCalculator {

    public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("org.example.coreprofessional.Grade: AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("org.example.coreprofessional.Grade: AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("org.example.coreprofessional.Grade: BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("org.example.coreprofessional.Grade: BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("org.example.coreprofessional.Grade: CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("org.example.coreprofessional.Grade: DD");
        } else if (marks >= 0 && marks <= 40) {
            System.out.println("org.example.coreprofessional.Grade: Fail");
        } else {
            System.out.println("Invalid marks entered");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (out of 100): ");
        int marks = scanner.nextInt();

        displayGrade(marks);
    }
}
*/
public class Grade {

    public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("org.example.coreprofessional.Grade: AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("org.example.coreprofessional.Grade: AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("org.example.coreprofessional.Grade: BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("org.example.coreprofessional.Grade: BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("org.example.coreprofessional.Grade: CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("org.example.coreprofessional.Grade: DD");
        } else if (marks >= 0 && marks <= 40) {
            System.out.println("org.example.coreprofessional.Grade: Fail");
        } else {
            System.out.println("Invalid marks entered");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (out of 100): ");
        int marks = scanner.nextInt();

        displayGrade(marks);
    }
}
