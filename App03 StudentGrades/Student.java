import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Connor Martin
 * @version (0.1 04/12/2020)
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    
    private Course course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credits to the students main point list
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
    /**
     * Return the number of credits the student has achived
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * returns the login name of the specific student its formed via the first 4 letters of the students name 
     * and 3 characters of the id that was given
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
        course.print();
    }
    
    public void enrolOnCourse(Course course)
    {
        this.course = course;
    }
    
    public void printCourse()
    {
        course.print();
        course.printGrade();
    } 
}
