
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
    public static final int MAX_MODULES = 4;
    
    private String codeNo;
    private String title;
    
    private int noModules; 
    private int totalScore; 
    private int totalCredits;
    private int meanMark;
    
    private boolean complete;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        noModules = 0;
        totalScore = 0;
        totalCredits = 0;
        complete = false;
    }
    
    /**
     * Adds the ability to add 1 out of 4 modules
     */
    public void addModule(int number, Module module)
    {
        if((number >= 1) && (number <= MAX_MODULES)) noModules++;
        
        switch(number)
        {
            case 1: module1 = module; break;
            case 2: module2 = module; break;
            case 3: module3 = module; break;
            case 4: module4 = module; break;
        }
    }
    
    /**
     * Prints each module when selected
     */
    private void printModules()
    {
        if(module1 != null) module1.print();
        if(module2 != null) module2.print();
        if(module3 != null) module3.print();
        if(module4 != null) module4.print();
    }
    
    public void printGrade()
    {
        if(noModules == MAX_MODULES)
        {
            totalScore = 0;
            
            addMark(module1);
            addMark(module2);
            addMark(module3);
            addMark(module4);
            
            if(totalCredits == MAX_MODULES * Module.CREDIT)
            {
                System.out.println("Your final mark is " + meanMark + " your final grade is " + calculateGrade());
            }
            else
            {
            System.out.println("You have not completed your course yet!");
            }
        }
    }
    
    private void addMark(Module module)
    {
        if(module.isComplete())
        {
            totalScore = totalScore + module.getMark();
            totalCredits += module.CREDIT;
        }
    }
    
    private String calculateGrade()
    {
        meanMark = totalScore / MAX_MODULES;
        
        if(meanMark <= 40)
        {
            return "F";
        }
        else if(meanMark <= 50)
        {
            return "D";
        }
        else if(meanMark <= 60)
        {
            return "C";
        }
        else if(meanMark <= 70)
        {
            return "B";
        }
        else return "A";
    }
    
    
    /**
     * Prints prints out the courses details such as the specific course and its number
     */
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
        System.out.println();
        
        printModules();
    }
}    