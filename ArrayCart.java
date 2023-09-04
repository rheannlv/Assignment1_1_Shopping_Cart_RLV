import java.util.Arrays;
import java.text.NumberFormat;

public class ArrayCart<T> extends Item implements ShoppingCart<T>{
	
	private T[] cart;
	private int numberOfEntries;
	private boolean integrityOK = false;
	private static final int DEFAULT_CAPACITY = 5;
	private static final int MAX_CAPACITY = 10;
	
	public ArrayCart() {
		this(DEFAULT_CAPACITY);
	}//end empty argument constructor
	
	@SuppressWarnings("unchecked")
	public ArrayCart(int initialCapacity) {
		
		checkCapacity(initialCapacity);
		
		T[] tempCart = (T[])new Object[initialCapacity];
		cart = tempCart;
		numberOfEntries = 0;
		integrityOK = true;
	}//end constructor
	
	public ArrayCart(T[] contents) {
		
		checkCapacity(contents.length);
		cart = Arrays.copyOf(contents, contents.length);
		numberOfEntries = contents.length;
		integrityOK = true;
	}//end constructor
	
	
	@Override
	//Returns the total number of items in the cart
	public int getCurrentSize() {
		
		return numberOfEntries;
	}//end getCurrentSize

	@Override
	//Checks if the cart is empty, true if empty or otherwise false
	public boolean isEmpty() {
		
		return numberOfEntries == 0;
	}//end isEmpty

	@Override
	//Adds newEntry into cart, returns true if item is added or otherwise false
	public boolean add(T newEntry) {
		checkintegrity();
		if (isArrayFull())
		{
			doubleCapacity();
		}//end if
		
		cart[numberOfEntries] = newEntry;
		numberOfEntries++;
		
		return true;
	}//end add

	@Override
	//Removes one unspecified item from cart
	public T remove() {
		
		checkintegrity();
		T result = removeEntry(numberOfEntries - 1);
		return result;
	}//end remove unspecified

	@Override
	//Removes a specific item from the cart, returns true if item is removed or otherwise false
	public boolean remove(T anEntry) {
		checkintegrity();
		int index = getIndexOf(anEntry);
		T result = removeEntry(index);
		return anEntry.equals(result);
	}//end remove specified 

	@Override
	//Removes all items in shopping cart
	public void clear() {
		
		while (!isEmpty()) {
			remove(); 
		}//end while
		
	}//end clear

	@Override
	//Counts the number of times a specific item is in the cart
	public int getFrequencyOf(T anEntry) {
		checkintegrity();
		int counter = 0;
		
		for (int index = 0; index < numberOfEntries; index++)
		{
			if (anEntry.equals(cart[index]))
			{
				counter++;
			}//end if
		}//end for
		
		return counter;
	}//end getFrequency

	@Override
	//Searches for an item in the bag, returns true if the given item is in the cart or otherwise false
	public boolean contains(T anEntry) {
		checkintegrity();
		
		return getIndexOf(anEntry) >= 0;
	}//end contains

	@SuppressWarnings("unchecked")
	@Override
	//Lists all items in the shopping cart
	public T[] toArray() {
		checkintegrity();
		
		T[]result = (T[]) new Object[numberOfEntries];
		
		for (int index = 0; index < numberOfEntries; index++)
		{
			result[index] = cart[index];
		}//end for
		
		return result;
		
	}//end toArray
	
	@Override
	//saves the item of choice 
	public void save(T anEntry) {
		System.out.println(anEntry + " this item has been saved.");
	}//end save

	@Override
	//Returns the total price of items in the shopping cart
	public String getTotalPrice() {
		double totalPrice = 0.0;
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		for (int anEntry = 0; anEntry < numberOfEntries; anEntry++) {
			totalPrice += ((Item) cart[anEntry]).getPrice();
		}//end for
		
		return fmt.format(totalPrice);
	}//end getTotalPrice
	
	private int getIndexOf(T anEntry) {
		 int where = -1;
		 boolean found = false;
		 int index = 0;
		 
		 while(!found && (index < numberOfEntries))
		 {
			 if (anEntry.equals(cart[index]))
			 {
				 found = true;
				 where = index;
			 }//end if
			 index++;
		 }//end while
		 
		 return where;
	}//end getIndexOf
	
	private T removeEntry(int givenIndex) {
		T result = null;
		
		if (!isEmpty() && (givenIndex >= 0))
		{
			result = cart[givenIndex];
			int lastIndex = numberOfEntries - 1;
			cart[givenIndex] = cart[lastIndex];
			cart[lastIndex] = null;
			numberOfEntries--;
		}//end if
		return result;
	}//end removeEntry
	
	private boolean isArrayFull() {
		
		return numberOfEntries >=cart.length;
	}//end isArrayFull
	
	private void doubleCapacity() {
		int newLength = 2 * cart.length;
		checkCapacity(newLength);
		cart = Arrays.copyOf(cart, newLength);
	}//end doubleCapacity 
	
	private void checkCapacity(int capacity) {
		
		if (capacity > MAX_CAPACITY)
			throw new IllegalStateException("Attempt to create a bag whoes capacity exceeds " +
		"allowed maximum of " + MAX_CAPACITY);
	}//end checkCapacity
	
	private void checkintegrity() {
		if (!integrityOK)
			throw new SecurityException ("ArrayCart object is corrupt.");
		
	}//end check integrity

}//end class
