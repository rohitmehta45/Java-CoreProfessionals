/* 12. Write a Java method to display the current date and time. */
package org.example.coreprofessional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentDateTime {
    public static void displayDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date and Time: " + now.format(formatter));
    }
    public static void main(String[] args) {
        displayDateTime();
    }
}