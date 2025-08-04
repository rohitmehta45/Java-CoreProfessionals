package org.example.coreprofessional;/*Create a class called org.example.coreprofessional.MainProgram and inside the class create
a function called display() with no parameters and inside a body
of display method add a line “Hello, I am called”. Call the function
from the main method of org.example.coreprofessional.MainProgram by creating the object of org.example.coreprofessional.MainProgram.
 */

public class MainProgram {
    public void display() {
        System.out.println("Hello, I am called");
    }

    public static void main(String[] args) {
        MainProgram obj = new MainProgram();
        obj.display();
    }
}
