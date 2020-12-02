import java.time.LocalDateTime;
import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // price of the ticket displayed in pence
    private int price;
    // max time allowed in hours
    private String destination;
    
    // The date and or time
    
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
     * Gets the price of the ticket in pence
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Gets the name of the current destination
     */
    public String findDestination()
    {
        return destination;
    }
    
    /**
     * Returns the current date
     */
    public Date findCurrentDate()
    {
        return currentDate;
    }
}