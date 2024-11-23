package ProblemFour;

/**
 * The Shape abstract class represents a generic geometric shape.
 * It contains a name, and abstract methods for computing area and perimeter.
 * It also implements the Scalable interface.
 */
public abstract class Shape implements Scalable {
    // Instance variable for the name of the shape
    protected String name;

    /**
     * Constructor that sets the name of the shape.
     *
     * @param name The name of the shape.
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Abstract method to compute the area of the shape.
     *
     * @return The area of the shape.
     */
    public abstract double area();

    /**
     * Abstract method to compute the perimeter of the shape.
     *
     * @return The perimeter of the shape.
     */
    public abstract double perimeter();

    /**
     * Returns a string representation of the shape, including its name, area, and perimeter.
     *
     * @return A string describing the shape.
     */
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + area() + ", Perimeter: " + perimeter();
    }

    // No need to implement scale() here since Shape is abstract
}
