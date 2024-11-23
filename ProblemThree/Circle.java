package ProblemThree;

/**
 * The Circle class represents a circle, a special case of an ellipse where the major and minor axes are equal.
 */

 
public class Circle extends Ellipse {
    /**
     * Constructor that initializes the circle with a given radius.
     *
     * @param name The name of the shape.
     * @param radius The radius of the circle.
     */
    public Circle(String name, double radius) {
        super(name, radius, radius); // Call the Ellipse constructor with equal axes
    }
}