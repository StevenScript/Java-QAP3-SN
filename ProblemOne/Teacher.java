package ProblemOne;

/**
 * The Teacher class represents a teacher and extends the Person class.
 */


public class Teacher extends Person {
    // Private instance variables specific to Teacher
    private String mySubject; // The subject the teacher teaches
    private double mySalary;  // The teacher's annual salary

    /**
     * Constructs a new Teacher with the specified attributes.
     *
     * @param name     The teacher's name.
     * @param age      The teacher's age.
     * @param gender   The teacher's gender.
     * @param subject  The subject taught by the teacher.
     * @param salary   The teacher's salary.
     */
    public Teacher(String name, int age, String gender, String subject, double salary) {
        // Call the superclass to initialize
        super(name, age, gender);
        // Initialize Teacher-specific attributes
        mySubject = subject;
        mySalary = salary;
    }


// --- SETTERS AND GETTERS --- //

    /**
     * Returns a string representation of the teacher.
     *
     * @return A string containing the teacher's details.
     */
    @Override
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: $" + mySalary;
    }

    /**
     * Gets the teacher's subject.
     *
     * @return The subject taught by the teacher.
     */
    public String getSubject() {
        return mySubject;
    }

    /**
     * Sets the teacher's subject.
     *
     * @param subject The new subject.
     */
    public void setSubject(String subject) {
        mySubject = subject;
    }

    /**
     * Gets the teacher's salary.
     *
     * @return The teacher's salary.
     */
    public double getSalary() {
        return mySalary;
    }

    /**
     * Sets the teacher's salary.
     *
     * @param salary The new salary.
     */
    public void setSalary(double salary) {
        mySalary = salary;
    }
}
