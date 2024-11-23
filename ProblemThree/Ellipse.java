package ProblemThree;

/**
 * The Ellipse class represents an ellipse shape with a major and minor axis.
 */

public class Ellipse extends Shape {
    // Major and minor axes
    private double a; // Major axis
    private double b; // Minor axis

    /**
     * Constructor that initializes the ellipse with given axes.
     * Assigns the larger value to 'a' (major axis) and the smaller to 'b' (minor axis).
     *
     * @param name The name of the shape.
     * @param axis1 The first axis length.
     * @param axis2 The second axis length.
     */
    public Ellipse(String name, double axis1, double axis2) {
        super(name); // Call the superclass constructor to set the name
        // Assign the larger value to 'a' and the smaller to 'b'
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    /**
     * Computes the area of the ellipse.
     *
     * @return The area of the ellipse.
     */
    @Override
    public double area() {
        return Math.PI * a * b;
    }

    /**
     * Computes the perimeter of the ellipse using the approximation formula.
     *
     * @return The perimeter of the ellipse.
     */
    @Override
    public double perimeter() {
        // If a == b, it's a circle
        if (a == b) {
            return 2 * Math.PI * a;
        }
        // Approximate perimeter formula for an ellipse
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }
}
