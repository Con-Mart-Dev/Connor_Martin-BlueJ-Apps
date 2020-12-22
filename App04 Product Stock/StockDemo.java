import java.util.Random;

/**
 * Demonstrate the StockBoss and Product classes.
 * The demonstration becomes properly functional as
 * the StockBoss class is completed.
 * 
 * @author Connor Martin
 * @version 2020.12.22
 * 
 * @modifed by Connor Martin
 * 22/Dec/2020
 */
public class StockDemo
{
    public static final int FIRST_ID = 100;
    public static final int LAST_ID = 109;
    
    // The stock boss.
    private StockBoss manager;
    
    private Random randomGenerator;

    /**
     * Create a StockManager and populate it with
     * 10 sample products.
     */
    public StockDemo(StockBoss manager)
    {
        randomGenerator = new Random();
        this.manager = manager;
        
        int id = FIRST_ID;
        manager.addProduct(new Product(id,"Apple iPhone 11"));
        
        id++;
        manager.addProduct(new Product(id,"Samsung Galaxy S10"));
        
        id++; 
        manager.addProduct(new Product(id,"Samsung Galaxy S20"));
        
        id++; 
        manager.addProduct(new Product(id,"Gogle Pixel 4A"));
        
        id++; 
        manager.addProduct(new Product(id,"Motorola G8 Power Lite"));
        
        id++; 
        manager.addProduct(new Product(id,"Motorola G8 Power"));
        
        id++; 
        manager.addProduct(new Product(id,"Samsung Galaxy Note 7"));
        
        id++; 
        manager.addProduct(new Product(id,"Huawei Mate 10 Pro"));
        
        id++; 
        manager.addProduct(new Product(id,"Sony Xperia XZ1"));
        
        id++; 
        manager.addProduct(new Product(id,"Apple iPhone 11"));
    }
    
    public void runDemo()
    {
       manager.printAllProducts();
       demoDeliverProducts();
       manager.printAllProducts();
       demoSellProducts();
       manager.printAllProducts();
       
       manager.removeProduct(102);
       manager.renameProduct(103, "Huawei Mate 10 Pro");
       
       // manager.restockLowProducts(3);
       // manager.searchProducts("Samsung");
    }
    
    private void demoDeliverProducts()
    {
       for(int id = FIRST_ID; id < LAST_ID; id++)
       {
           int quantity = randomGenerator.nextInt(6) + 1;
           manager.takeDelivery(id, quantity);
       }
    }
   
    /**
     * Show that a phone can be taken of the shelves
     * by the StockBoss
     */
    public void removeProduct(int id)
    {
        manager.printAllProducts();
        manager.removeProduct(id);
        manager.printAllProducts();
    }
   
    /**
     * Demonstrate that the StockBoss can sell all
     * different amounts of all of the products
     */
    private void demoSellProducts()
    {
        manager.printAllProducts();
        
        for(int id = FIRST_ID; id < LAST_ID; id++ )
        {
            int quantity = randomGenerator.nextInt(6) + 1;
            manager.sellProduct(id, quantity);
        }
        
        manager.printAllProducts();
    }
 
    
}
