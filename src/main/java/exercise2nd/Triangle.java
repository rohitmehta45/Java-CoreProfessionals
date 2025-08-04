/* 
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
by creating a class named 'Triangle' without any parameter in its constructor.
Area = sqrt(s *(s-side1)*(s-side2)*(s-side3))
*/

package exercise2nd;

public class Triangle {
    int side1, side2, side3;

    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public int getPerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}