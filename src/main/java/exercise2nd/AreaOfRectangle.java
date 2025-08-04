/*
Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
by creating a class named 'Rectangle' with a method named 'Area' which returns the area and
length and breadth passed as parameters to its constructor.
*/

package exercise2nd;

public class AreaOfRectangle {
    int length;
    int breadth;
    public AreaOfRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        AreaOfRectangle rect1 = new AreaOfRectangle(4, 5);
        AreaOfRectangle rect2 = new AreaOfRectangle(5, 8);

        System.out.println("Area of first rectangle (4x5): " + rect1.Area());
        System.out.println("Area of second rectangle (5x8): " + rect2.Area());
    }
}
