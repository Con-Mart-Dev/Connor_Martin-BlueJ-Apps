
/**
 * Write a description of class Module here.
 *
 * @author (Connor Martin)
 * @version (0.1 04/12/2020)
 */
public class Module
{
    public static final int CREDIT = 30;
    
    private String title;
    private String codeNo;
    
    private int mark;
    private boolean complete;
    
    /**
     * Constructor for holding if a module has been completed and its indentification
     */
    public Module(String title, String codeNo)
    {
         mark = -1;
         this.title = title;
         this.codeNo = codeNo;
         complete = false;
    }
    
    public void print()
    {
        System.out.println("\tModule " + codeNo);
        System.out.println(" " + title);
        if(isComplete())
        {
            System.out.println(" mark = " + mark);
        }
        else
        {
            System.out.println("You have not completed yet!");
        }
    }
    
    public void awardMark(int mark)
    {
        if ((mark >=0) && (mark <=100))
        {
            this.mark = mark;
            complete = true;
        }
        else
        {
            System.out.println("Invalid mark entered");
        }
    }
    
    /**
     * Returns mark between 0 and 100 if the mark is less than 0 then no mark has been given
     */
    public int getMark()
    {
        return mark;
    }
    
    /**
     * Returns the mark after the module has been completed
     */
    public boolean isComplete()
    {
        return complete;
    }
    
    
}
