
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Connor Martin
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
        
    private Grades finalgrade;
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        module1 = new Module("Programming Concepts", "CO452");
        module1 = new Module("Computer Archtecture", "CO450");
        module1 = new Module("3D Modeling", "CO455");
        module1 = new Module("Web Development", "CO478");
    }
    
    public void addmark(int mark, int codeNo)
    {
        if (codeNo == 1)
        {
            module1.awardMark(mark);
        }
        
        if (codeNo == 2)
        {
            module2.awardMark(mark);
        }
        
        if (codeNo == 3)
        {
            module3.awardMark(mark);
        }
        
        if (codeNo == 4)
        {
            module4.awardMark(mark);
        }
        
        if ((codeNo <1) && (codeNo >4))
        {
            System.out.println("Not a module from 1 - 4");
        }
        
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    /**
     * It takes the mark created and outputs a grade score from it.
     */
    public Grades convertToGrades(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
        else if((mark >= 40) && (mark < 50))
        {
            return Grades.D;
        }
        else if((mark >= 50) && (mark < 60))
        {
            return Grades.C;
        }
        else if((mark >= 60) && (mark < 70))
        {
            return Grades.B;
        }
        else if((mark >= 70) && (mark <= 100))
        {
            return Grades.A;
        }
        else return Grades.X;
    }
}