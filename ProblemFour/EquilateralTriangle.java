package ProblemFour;

/**
 * The EquilateralTriangle class represents a triangle with all sides equal.
 */
public class EquilateralTriangle extends Triangle {
    /**
     * Constructor that initializes the equilateral triangle with a given side length.
     *
     * @param name The name of the shape.
     * @param side The length of all sides.
     */
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side); // Call the Triangle constructor with equal sides
    }
}
