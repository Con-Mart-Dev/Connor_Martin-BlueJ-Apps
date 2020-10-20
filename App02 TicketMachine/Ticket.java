import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private int price;
    private String destination;
    private Date currentDate = new Date();

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int findPrice()
    {
        return price;
    }

    public String findDestination()
    {
        return destination;
    }
    
    public Date findCurrentDate()
    {
        return currentDate;
    }
}