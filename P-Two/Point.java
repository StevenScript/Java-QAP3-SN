/**
 * The Point class represents a point in 2D space with x and y coordinates.
 */

 public class Point {
    // Private instance variables for x and y coordinates
    private float x = 0.0f;
    private float y = 0.0f;

    /**
     * Default constructor that initializes x and y to 0.0f.
     */
    public Point() {
        // x and y are already initialized to 0.0f by default.
    }

    /**
     * Constructor that initializes x and y to the provided values.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate of the point.
     *
     * @return The x-coordinate.
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point.
     *
     * @param x The new x-coordinate.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate of the point.
     *
     * @return The y-coordinate.
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point.
     *
     * @param y The new y-coordinate.
     */
    public void setY(float y) {
        this.y = y;
    }


    // setXY get getXY
    /**
     * Sets both x and y coordinates of the point.
     *
     * @param x The new x-coordinate.
     * @param y The new y-coordinate.
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets both x and y coordinates of the point.
     *
     * @return An array containing x and y coordinates.
     */
    public float[] getXY() {
        return new float[] { x, y };
    }


    /**
     * Returns a string representation of the point.
     *
     * @return A string in the format "(x, y)".
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
