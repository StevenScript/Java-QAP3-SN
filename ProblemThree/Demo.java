package ProblemThree;

/**
 * The Demo class tests the Shape hierarchy by creating various shape objects and displaying their properties.
 */

public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[5];

        // Instantiate different shapes
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse("Ellipse", 6.0, 4.0);
        shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6.0);
        shapes[4] = new Ellipse("Circle as Ellipse", 5.0, 5.0); // Circle represented as Ellipse

        // Loop through the array and display each shape's details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}