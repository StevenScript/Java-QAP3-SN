package ProblemOne;

/**
 * The Demo class tests the Person, Student, Teacher, and CollegeStudent classes.
 */

 
public class Demo {
    public static void main(String[] args) {
        // Create a Person object
        Person bob = new Person("Coach Bob", 27, "M");
        // Display the Person object's information
        System.out.println(bob);

        // Create a Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        // Display the Student object's information
        System.out.println(lynne);

        // Create a Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        // Display the Teacher object's information
        System.out.println(mrJava);

        // Create a CollegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        // Display the CollegeStudent object's information
        System.out.println(ima);
    }
}
