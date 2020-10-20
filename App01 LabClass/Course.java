
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    //Setup courseName field
    private String courseName;  
    //Setup courseNumber field
    private String courseNumber;

    
    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseNumber)
    {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    /**
     * Print the course Name and Number
     */
    public void print()
    {
        System.out.println(" Course: "+ courseName + " Number: " + courseNumber);   
    }
}
