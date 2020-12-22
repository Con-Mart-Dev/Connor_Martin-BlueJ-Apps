/**
 * Model some details of a product sold by a company.
 * 
 * @author Connor Martin
 * @version 2020.12.22
 * 
 * @modifed by Connor Martin
 * 22/Dec/2020
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock amount: " + quantity;
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public boolean sellOne()
    {
        if(quantity > 0) 
        {
            quantity--;
            return true;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + id + ":" + name);
            
                return false;
        }
    }
    
    /**
     * Try to restock with a specific amount of said product.
     * The current amount is incremented by the specific amount.
     * The number of items is specifically added to the stock, thus it must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Try to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }


    /**
     * The products name should only be changed if there is
     * a spelling mistake, otherwise it will cause confusion
     */
    public void setName(String newName)
    {
        name = newName;
    }
}
