package ProblemTwo;

/**
 * The Demo class tests the Point and MovablePoint classes by creating objects
 * and demonstrating their functionality.
 */

 
public class Demo {
    public static void main(String[] args) {
        // Test the Point class
        System.out.println("Testing Point class:");
        // Create a Point object using the default constructor
        Point p1 = new Point();
        System.out.println("Default Point: " + p1); // Expected output: (0.0, 0.0)

        // Create a Point object with specific coordinates
        Point p2 = new Point(2.5f, 3.8f);
        System.out.println("Initialized Point: " + p2); // Expected output: (2.5, 3.8)

        // Test the MovablePoint class
        System.out.println("\nTesting MovablePoint class:");
        // Create a MovablePoint object using the default constructor
        MovablePoint mp1 = new MovablePoint();
        System.out.println("Default MovablePoint: " + mp1); // Expected output: (0.0, 0.0), speed=(0.0, 0.0)

        // Create a MovablePoint object with specific speed
        MovablePoint mp2 = new MovablePoint(1.2f, 1.5f);
        System.out.println("MovablePoint with speed: " + mp2); // Expected output: (0.0, 0.0), speed=(1.2, 1.5)

        // Create a MovablePoint object with specific coordinates and speed
        MovablePoint mp3 = new MovablePoint(2.0f, 3.0f, 0.5f, 0.5f);
        System.out.println("Initialized MovablePoint: " + mp3); // Expected output: (2.0, 3.0), speed=(0.5, 0.5)

        // Move the MovablePoint
        mp3.move();
        System.out.println("After move: " + mp3); // Expected output: (2.5, 3.5), speed=(0.5, 0.5)

        // Chain multiple moves
        mp3.move().move();
        System.out.println("After two more moves: " + mp3); // Expected output: (3.5, 4.5), speed=(0.5, 0.5)

        // Modify the speed and move again
        mp3.setSpeed(1.0f, 1.0f);
        mp3.move();
        System.out.println("After changing speed and moving: " + mp3); // Expected output: (4.5, 5.5), speed=(1.0, 1.0)
    }
}
