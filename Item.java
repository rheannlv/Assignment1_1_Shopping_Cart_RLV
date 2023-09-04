
public class Item {

	private String description;
	private double price; 
	private int itemID;
	
	public Item() {
		this.description = "";
		this.price = 0.0;
		this.itemID = 0;
	}//end empty argument constructor 
	
	public Item(String description, double price, int itemID) {
		this.description = description;
		this.price = price;
		this.itemID = itemID;
	}//end preferred constructor

	public String getDescription() {
		return description;
	}//end getDescription

	public double getPrice() {
		return price;
	}//end getPrice

	public int getItemID() {
		return itemID;
	}//end getItemID

	@Override
	public String toString() {
		return "[Description: " + description + ", Price: $" + price + ", Item ID: " + itemID + "]";
	}//end toString
	
	
}//end class
