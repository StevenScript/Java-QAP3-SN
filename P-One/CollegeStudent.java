/**
 * The CollegeStudent class represents a college student and extends the Student class.
 */

public class CollegeStudent extends Student {
    // Private instance variables specific to CollegeStudent
    private int myYear;       // The student's current year in college (1=Freshman, etc.)
    private String myMajor;   // The student's major

    /**
     * Constructs a new CollegeStudent with the specified attributes.
     *
     * @param name    The student's name.
     * @param age     The student's age.
     * @param gender  The student's gender.
     * @param idNum   The student's ID number.
     * @param gpa     The student's GPA.
     * @param year    The student's current year in college.
     * @param major   The student's major.
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        // Call  parent superclass to initialize inherited attributes
        super(name, age, gender, idNum, gpa);
        // Initialize CollegeStudent-specific attributes
        myYear = year;
        myMajor = major;
    }

    /**
     * Returns a string representation of the college student.
     *
     * @return A string containing the college student's details.
     */
    @Override
    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }

    /**
     * Gets the student's current year in college.
     *
     * @return The student's year.
     */
    public int getYear() {
        return myYear;
    }

    /**
     * Sets the student's current year in college.
     *
     * @param year The new year.
     */
    public void setYear(int year) {
        myYear = year;
    }

    /**
     * Gets the student's major.
     *
     * @return The student's major.
     */
    public String getMajor() {
        return myMajor;
    }

    /**
     * Sets the student's major.
     *
     * @param major The new major.
     */
    public void setMajor(String major) {
        myMajor = major;
    }
}
