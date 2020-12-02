import java.text.SimpleDateFormat;

/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    public static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 220);
    public static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);
    public static final Ticket WYCOMBE_TICKET = new Ticket("High Wycombe", 330);
    
    // current ticket
    private Ticket chosenTicket;
    
    // The amount of money entered by a customer so far.
    private int balance;
    
    // The total amount of money collected by this machine.
    private int total;
    
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        chosenTicket=null;
        
        balance = 0;
        total = 0;
    }

    public void PrintDestinations()
    {
        printHeading();
        System.out.println();
        
        System.out.print(" Ticket to " + AYLESBURY_TICKET.findDestination());
        System.out.println(" cost " + AYLESBURY_TICKET.getPrice());
        
        System.out.print(" Ticket to " + AMERSHAM_TICKET.findDestination());
        System.out.println(" cost " + AMERSHAM_TICKET.getPrice());
        
        System.out.print(" Ticket to " + WYCOMBE_TICKET.findDestination());
        System.out.println(" cost " + WYCOMBE_TICKET.getPrice());
    }
    
    public void addAylesbury()
    {
        chosenTicket =AYLESBURY_TICKET;
    }
    
    public void addAmersham()
    {
        chosenTicket =AMERSHAM_TICKET;
    }
    
    public void addWycombe()
    {
        chosenTicket =WYCOMBE_TICKET;
    }
    
    public int getPrice()
    {
        if(chosenTicket != null)
        {
            return chosenTicket.getPrice();
        }
        else
        {
            System.out.println("Your have not chosen a destination!");
            return 0;
        }
    }
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    public void balanceUpdate(int amount)
    {
        balance = balance + amount;
        
        System.out.println("Received " + amount + " pence");
        displayBalance();
    }
    
    public void displayBalance()
    {
        System.out.println("Your Balance:"+ balance);
    }
   
    public void insert10()
    {
        balanceUpdate(10);
    }
    
    public void insert20()
    {
        balanceUpdate(20);
    }
    
    public void insert100()
    {
        balanceUpdate(100);
    }
    
    public void insert200()
    {
        balanceUpdate(200);
    }
    
    private void printHeading()
    {
        System.out.println();
        System.out.println(" ##############################");
        System.out.println(" #       BlueJ Trains         #");
        System.out.println(" #  Train Tickets - PAY HERE  #");
        System.out.println(" ##############################");
        System.out.println();
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int price = chosenTicket.getPrice();
        
        String date = formatter.format(chosenTicket.findCurrentDate());
        String destination = chosenTicket.findDestination();
        
        if(balance >= price) {
            // Simulate the printing of a ticket.
            printHeading();
            
            System.out.println("Your Train Ticket to ");
            System.out.println(destination);
            System.out.println("On Date: " + date);
            System.out.println("Cost: " + price + "pence");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the prince.
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more pence.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
