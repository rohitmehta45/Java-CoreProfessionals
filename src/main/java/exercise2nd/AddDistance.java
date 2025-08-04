/*
Add two distances in inch-feet by creating a class named 'AddDistance'.
Each distance has two parts: feet and inches.
If inches are 12 or more after addition, convert to feet accordingly.
*/

package exercise2nd;

import java.util.Scanner;

public class AddDistance {
    int feet;
    int inches;

    public void setDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public AddDistance addDistances(AddDistance d2) {
        AddDistance result = new AddDistance();
        result.feet = this.feet + d2.feet;
        result.inches = this.inches + d2.inches;

        if (result.inches >= 12) {
            result.feet += result.inches / 12;
            result.inches = result.inches % 12;
        }

        return result;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddDistance d1 = new AddDistance();
        AddDistance d2 = new AddDistance();

        System.out.print("Enter feet and inches for first distance: ");
        d1.setDistance(sc.nextInt(), sc.nextInt());

        System.out.print("Enter feet and inches for second distance: ");
        d2.setDistance(sc.nextInt(), sc.nextInt());

        AddDistance result = d1.addDistances(d2);

        System.out.print("Sum of distances: ");
        result.display();
    }
}
