
public interface ShoppingCart<T> {
	
	public int getCurrentSize();
	//Returns the total number of items in the cart
	
	public boolean isEmpty();
	//Checks if the cart is empty, true if empty or otherwise false
	
	public boolean add(T newEntry);
	//Adds newEntry into cart, returns true if item is added or otherwise false
	
	public T remove();
	//Removes one item from cart
	
	public boolean remove(T anEntry);
	//Removes a specific item from the cart, returns true if item is removed or otherwise false
	
	public void clear();
	//Removes all items in shopping cart
	
	public int getFrequencyOf(T anEntry);
	//Counts the number of times a specific item is in the cart
	
	public boolean contains(T anEntry);
	//Searches for an item in the bag, returns true if the given item is in the cart or otherwise false
	
	public T[] toArray();
	//Lists all items in the shopping cart
	
	public void save(T anEntry);
	//Notifies if the item is saved for later
	
	public String getTotalPrice();
	//Adds prices of items 
	
}//end interface
