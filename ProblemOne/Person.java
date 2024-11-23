package ProblemOne;

/**
 * This Person class represents a generic "person" with basic attributes.
 */


public class Person {
    // Protected instance variables accessible by subclasses
    protected String myName;    // The person's name
    protected int myAge;        // The person's age
    protected String myGender;  // The person's gender ("M" or "F")

    /**
     * Constructs a new Person with the specified name, age, and gender.
     *
     * @param name   The person's name.
     * @param age    The person's age.
     * @param gender The person's gender
     */
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return A string containing the person's name, age, and gender.
     */
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }


// --- SETTERS AND GETTERS --- //


     /**
     * Gets the person's name.
     *
     * @return The person's name.
     */
    public String getName() {
        return myName;
    }

    /**
     * Sets the person's name.
     *
     * @param name The new name.
     */
    public void setName(String name) {
        myName = name;
    }

    /**
     * Gets the person's age.
     *
     * @return The person's age.
     */
    public int getAge() {
        return myAge;
    }

    /**
     * Sets the person's age.
     *
     * @param age The new age.
     */
    public void setAge(int age) {
        myAge = age;
    }

    /**
     * Gets the person's gender.
     *
     * @return The person's gender.
     */
    public String getGender() {
        return myGender;
    }

    /**
     * Sets the person's gender.
     *
     * @param gender The new gender ("M" or "F").
     */
    public void setGender(String gender) {
        myGender = gender;
    }
}
