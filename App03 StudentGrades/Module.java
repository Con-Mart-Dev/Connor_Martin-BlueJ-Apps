
/**
 * Write a description of class Module here.
 *
 * @author (Connor Martin)
 * @version (0.1 )
 */
public class Module
{
    private String title;
    private String codeNo;
    private int mark;
    
    private boolean completed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
         mark = 0;
         this.title = title;
         this.codeNo = codeNo;
         completed = false;
    }
    
    public void print()
    {
        System.out.println("Module: "+ codeNo + " " + title + " Mark = "+ mark); 
    }
    
    public void awardMark(int mark)
    {
        if ((mark >=0) && (mark <=100))
        {
            this.mark = mark;
            if(mark >= 40)completed = true;
        }
        else
        {
            System.out.println("Invalid mark entered");
        }
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setCodeNo(String codeNo)
    {
        this.codeNo = codeNo;
    }
    
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    
    public boolean isComplete()
    {
        return this.completed;
    }
    
}
