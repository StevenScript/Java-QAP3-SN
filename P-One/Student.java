/**
 * Student class represents a student and extends my Person class
 */


public class Student extends Person {
    // Protected instance variables specific to Student
    protected String myIdNum; // The student's ID number
    protected double myGPA;   // The student's grade point average

    /**
     * Constructs a new Student with the specified attributes.
     *
     * @param name    The student's name.
     * @param age     The student's age.
     * @param gender  The student's gender.
     * @param idNum   The student's ID number.
     * @param gpa     The student's GPA.
     */
    public Student(String name, int age, String gender, String idNum, double gpa) {
        // Call the superclass constructor(parent) to use inherited attributes
        super(name, age, gender);
        // Student-specific attributes
        myIdNum = idNum;
        myGPA = gpa;
    }


// --- SETTERS AND GETTERS --- //

    /**
     * Returns a string representation of the student.
     *
     * @return A string containing the student's details.
     */
    @Override
    public String toString() {
        return super.toString() + ", student ID: " + myIdNum + ", GPA: " + myGPA;
    }
    /**
     * Gets the student's ID number.
     *
     * @return The student's ID number.
     */
    public String getIdNum() {
        return myIdNum;
    }

    /**
     * Sets the student's ID number.
     *
     * @param idNum The new ID number.
     */
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    /**
     * Gets the student's GPA.
     *
     * @return The student's GPA.
     */
    public double getGPA() {
        return myGPA;
    }

    /**
     * Sets the student's GPA.
     *
     * @param gpa The new GPA.
     */
    public void setGPA(double gpa) {
        myGPA = gpa;
    }
}
