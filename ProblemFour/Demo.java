package ProblemFour;

/**
 * The Demo class tests the Shape hierarchy by creating various shape objects,
 * scaling them, and displaying their properties before and after scaling.
 */
public class Demo {
    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] scalableShapes = new Scalable[5];

        // Instantiate different shapes
        scalableShapes[0] = new Circle("Circle", 5.0);
        scalableShapes[1] = new Ellipse("Ellipse", 6.0, 4.0);
        scalableShapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
        scalableShapes[3] = new EquilateralTriangle("Equilateral Triangle", 6.0);
        scalableShapes[4] = new Ellipse("Circle as Ellipse", 5.0, 5.0); // Circle represented as Ellipse

        // Print shapes before scaling
        System.out.println("Shapes before scaling:");
        for (Scalable shape : scalableShapes) {
            System.out.println(shape);
        }

        // Scale the shapes
        double scaleFactor = 2.0;
        scaleShapes(scalableShapes, scaleFactor);

        // Print shapes after scaling
        System.out.println("\nShapes after scaling by a factor of " + scaleFactor + ":");
        for (Scalable shape : scalableShapes) {
            System.out.println(shape);
        }
    }

    /**
     * Static method that scales all Scalable objects in the array by the given factor.
     *
     * @param scalables Array of Scalable objects.
     * @param factor    The scaling factor.
     */
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
