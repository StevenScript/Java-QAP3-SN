/**
 * The Triangle class represents a triangle with three sides.
 */

 
public class Triangle extends Shape {
    // Sides of the triangle
    protected double side1;
    protected double side2;
    protected double side3;

    /**
     * Constructor that initializes the triangle with given sides.
     * Checks if the sides satisfy the triangle inequality.
     *
     * @param name  The name of the shape.
     * @param side1 Length of side 1.
     * @param side2 Length of side 2.
     * @param side3 Length of side 3.
     */
    public Triangle(String name, double side1, double side2, double side3) {
        super(name); // Call the superclass constructor to set the name
        // Check the triangle inequality
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.err.println("Error: The given sides do not form a valid triangle.");
            System.exit(1); // Terminate the program
        }
    }

    /**
     * Checks if the sides satisfy the triangle inequality.
     *
     * @param s1 Side 1.
     * @param s2 Side 2.
     * @param s3 Side 3.
     * @return True if valid, false otherwise.
     */
    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2);
    }

    /**
     * Computes the area of the triangle using Heron's formula.
     *
     * @return The area of the triangle.
     */
    @Override
    public double area() {
        double s = perimeter() / 2.0; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Computes the perimeter of the triangle.
     *
     * @return The perimeter of the triangle.
     */
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}