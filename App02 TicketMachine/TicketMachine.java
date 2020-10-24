
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author Connor Joesph Martin
 * @version 2020.10.24
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    public static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 220);
    public static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);
    public static final Ticket WYCOMBE_TICKET = new Ticket("High Wycombe", 330);
    // To decide which ticket is the current one selected
    private Ticket currentTicket;
    // The price of a specific ticket
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        currentTicket=null;
        balance = 0;
        total = 0;
    }

    /**
     * To allow current ticket to pick one out of 
     * three via suggesting this is a choice
     */
    public void addAylesbury()
    {
        currentTicket =AYLESBURY_TICKET;
    }
    
    /**
     * To allow current ticket to pick one out of 
     * three via suggesting this is a choice
     */
    public void addAmersham()
    {
        currentTicket =AMERSHAM_TICKET;
    }
    
    /**
     * To allow current ticket to pick one out of 
     * three via suggesting this is a choice
     */
    public void addWycombe()
    {
        currentTicket =WYCOMBE_TICKET;
    }
    
    /**
     * To update the current balance
     */
    public void balanceUpdate(int cash)
    {
        balance = balance + cash;
        
        System.out.println("Cash In"+cash);
        
    }
    
    /**
     * To display current balance you have before or after purchasing a 
     * ticket
     */
    public void displayBalance()
    {
        System.out.println("Your Balance:"+ balance);
    }
   
     /**
     * To insert 10 coins
     */
    public void insert10()
    {
        balanceUpdate(10);
    }
    
    /**
     * To insert 20 coins
     */
    public void insert20()
    {
        balanceUpdate(20);
    }
    
    /**
     * To insert 100 coins
     */
    public void insert100()
    {
        balanceUpdate(100);
    }
    
    /**
     * To insert 200 coins
     */
    public void insert200()
    {
        balanceUpdate(200);
    }
    
    /**
     * To insert a specific amount of coins without putting them individually
     */
        public void insertCoins(Coin aCoin)
    {
        balanceUpdate(aCoin.getValue());
    }
    
    /**
     * Which amount of coins are valid to input 
     */
    public void insertACoin(int value)
    {
        switch(value)
        {
            case 10: 
                balanceUpdate(value);
                break;
            case 20: 
                balanceUpdate(value);
                break;
            case 100: 
                balanceUpdate(value);
                break;
            case 200: 
                balanceUpdate(value);
                break;

            default:
                System.out.println(value+" Not Valid cents");
        }
    }
    
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("#  Ticket   ");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the prince.
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
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
