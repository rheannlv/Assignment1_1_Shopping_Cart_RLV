/** A class of items for sale.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 5.0
*/
public class Item
{
   private String description;
   private int   price;
   
   /** Creates instance of Item class
    * Initializing variables */
   	public Item() {
   		
   		this.description = "";
   		this.price = 0;
   		
   	}//end constructor
   	
   	/** Creates instance of Item class
   	 * @param productDescription The String holding description, productPrice The integer holding price 
   	 *  */
	public Item(String productDescription, int productPrice) 
	{
      description = productDescription;
      price = productPrice;
	} // end argument constructor
	
	/** Retrieving a description of the item
	 * @return a string describing the item */
	public String getDescription() 
	{
      return description;
	} // end getDescription
	
	/** Retrieving the price of the item 
	 * @return An integer number of the price */
	public int getPrice() 
	{
      return price;
	} // end getPrice
	
	/** The toString of the Item class
	 * @return A string holding the description and price of item(s). */
	public String toString() 
	{
      return description + " $" + price / 100 + "." + price % 100;
      
	} // end toString
} // end Item