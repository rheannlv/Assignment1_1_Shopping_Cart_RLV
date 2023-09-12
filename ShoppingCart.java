	/**
	 * 
	 * @author RVera
	 *	A class that implements a shopping
	 *	cart using Arraybag data structure.
	 */
public class ShoppingCart extends Item{
	
	private ArrayBag<Item> items;
	
	/**Creates new Arraybag holding Items */
	public ShoppingCart() {
		
		items = new ArrayBag<Item>();
		
	}//end default constructor 
	
	/** Retrieves current size of shopping cart
	 * @return Number of items added into shopping cart */
	public int getCurrentSize() {
		
		return items.getCurrentSize();
		
	}//end getCurrentSize
	
	/**Checks if shopping cart is empty
	 * @return True if cart is empty or false otherwise */
	public boolean isEmpty() {
		
		return items.isEmpty();
		
	}//end isEmpty
	
	/** Adds new item into cart
	 * @param newitems The item added into cart
	 * @return True if item was successfully added or false otherwise */
	public boolean add(Item newitems) {
		
		return items.add(newitems);
	}//end add
	
	/** Removes top entry item
	 * @return Description of item removed from cart */
	public Item remove() {
		
		return items.remove();
		
	}//end remove
	
	/** Removes chosen item from cart.
	 * @param newitems the item being removed.
	 * @return Description of item removed from the cart. */
	public boolean remove(Item newitems) {
		
		return items.remove(newitems);
	}//end remove item
	
	/** The number of items a chosen item is added into cart.
	 * @param newitems The item to be counted.
	 * @return The number of times newitems is in the cart. */
	public int getFrequencyOf(Item newitems) {
		
		return items.getFrequencyOf(newitems);
		
	}//end getFrequency
	
	/** Removes all entries from cart */
	public void clear() {
		
		items.clear();
		
	}//end clear
	
	/** Checks cart if it contains a certain item
	 * @param newitems The item being searched
	 * @return True if the cart contains newitems, or false otherwise */
	public boolean contains(Item newitems) {
		
		return items.contains(newitems);
		
	}//end contains
	
	/** Retrieves all items in the cart
	 * @return An array of all the items in the cart */
	public Object[] toArray() {
		
		return items.toArray();
	}//end toArray
	
	/** Saves chosen item in the cart
	 * @param item The item to be saved
	 * @return An output statement that the item is saved */
	public void save(Item items) {
		System.out.println(items + " this item has been saved.");
	}//end save
	
	/** Calculates totalPrice of items in the shopping cart
	 * @return a formatted string holding the price of the items in the cart */
	public String getTotalPrice() {
		int totalPrice = 0;
		
		Object[] itemArray = items.toArray();
			
		for (int index = 0; index < itemArray.length; index++) {
			
			totalPrice += ((Item) itemArray[index]).getPrice();
		}//end for loop
		
		return " $" + totalPrice / 100 + "." + totalPrice % 100;

	}//end getTotalPrice
	
}//end class
