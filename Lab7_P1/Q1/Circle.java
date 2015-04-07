package Lab7_P1.Q1;

/**
 * Created by ZaidK on 15-03-27.
 */

public class Circle extends GeometricObject {
    private double radius;

    // Constructs a new circle with the given radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Returns the area of this circle.
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Returns the perimeter of this circle.
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
