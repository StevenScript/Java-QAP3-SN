package ProblemTwo;

/**
 * The MovablePoint class represents a point that can be moved by a speed along the x and y axes.
 * It extends the Point class and adds speed attributes and methods to move the point.
 */

 
public class MovablePoint extends Point {
    // Private instance variables for speed in the x and y directions
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    /**
     * Default constructor that initializes x, y, xSpeed, and ySpeed to 0.0f.
     */
    public MovablePoint() {
        super(); // Calls the default constructor of Point
        // xSpeed and ySpeed are already initialized to 0.0f by default
    }

    /**
     * Constructor that initializes xSpeed and ySpeed with provided values.
     * The x and y coordinates are initialized to 0.0f by the superclass.
     *
     * @param xSpeed The speed along the x-axis.
     * @param ySpeed The speed along the y-axis.
     */
    public MovablePoint(float xSpeed, float ySpeed) {
        super(); // x and y are set to 0.0f by the Point class
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructor that initializes x, y, xSpeed, and ySpeed with provided values.
     *
     * @param x      The x-coordinate.
     * @param y      The y-coordinate.
     * @param xSpeed The speed along the x-axis.
     * @param ySpeed The speed along the y-axis.
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Initializes x and y using Point's constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Gets the speed along the x-axis.
     *
     * @return The xSpeed value.
     */
    public float getXSpeed() {
        return xSpeed;
    }

    /**
     * Sets the speed along the x-axis.
     *
     * @param xSpeed The new xSpeed value.
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * Gets the speed along the y-axis.
     *
     * @return The ySpeed value.
     */
    public float getYSpeed() {
        return ySpeed;
    }

    /**
     * Sets the speed along the y-axis.
     *
     * @param ySpeed The new ySpeed value.
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Sets both xSpeed and ySpeed.
     *
     * @param xSpeed The new speed along the x-axis.
     * @param ySpeed The new speed along the y-axis.
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Gets both xSpeed and ySpeed.
     *
     * @return An array containing xSpeed and ySpeed.
     */
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    /**
     * Moves the point by adding xSpeed to x and ySpeed to y.
     * Since x and y are private in Point, we use the public getters and setters.
     *
     * @return The updated MovablePoint object.
     */
    public MovablePoint move() {
        // Update the x and y coordinates using the speeds
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this; // Return the current object for method chaining if desired
    }

    /**
     * Returns a string representation of the movable point.
     * The format is "(x, y), speed=(xSpeed, ySpeed)".
     *
     * @return A string describing the movable point.
     */
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}


