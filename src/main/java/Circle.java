/*  Write a method to find the area of a circle. */
public class Circle {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("Area of circle with radius 5: " + area(5));
    }
}