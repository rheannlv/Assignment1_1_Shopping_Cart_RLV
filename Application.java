/** 
 * @author RVera
 * Assignment 1.1 Shopping Cart
 * Application class of shopping cart program 
 * testing shopping cart methods 
 * 
 * */

public class Application {

	public static void main(String[] args) {
		
		//Instantiating first shopping cart
		ShoppingCart targetCart1 = new ShoppingCart();
				
		//Cart remains empty, testing isEmpty
		System.out.println("Testing isEmpty with an empty cart: " + targetCart1.isEmpty());
		System.out.println();
				
		//Instantiating second shopping cart 
		ShoppingCart targetCart2 = new ShoppingCart();
				
		//Adding items into cart
		Item item1 = new Item("Candle", 1500);
		targetCart2.add(item1);
		targetCart2.add(item1);
				
		Item item2 = new Item("Waffle-top Hoodie", 2300);
		targetCart2.add(item2);
				
		Item item3 = new Item("Floss", 300);
		targetCart2.add(item3);
				
		Item item4 = new Item("Mascara", 800);
		targetCart2.add(item4);
				
		Item item5 = new Item("Dog Toy", 500);
		targetCart2.add(item5);
				
		//Testing isEmpty with a full cart
		System.out.println("Testing isEmpty with a full cart: " + targetCart2.isEmpty());
		System.out.println();
				
		//Testing frequency of items
		System.out.println("Testing frequency of items in cart: ");
		System.out.println("How many candles are in the cart? " + targetCart2.getFrequencyOf(item1));
		System.out.println("How many waffle-top hoodies are in the cart? " + targetCart2.getFrequencyOf(item2));
		System.out.println("How many floss packs are in the cart? " + targetCart2.getFrequencyOf(item3));
		System.out.println("How many mascara tubes are in the cart? " + targetCart2.getFrequencyOf(item4));
		System.out.println("How many dog toys are in the cart? " + targetCart2.getFrequencyOf(item5));
		System.out.println();
				
		//Testing contain (dog toy), remove unspecified item (mascara) and remove specified item (dog toy)
		System.out.println("Testing contain and remove from shopping cart:");
		System.out.println("Does the cart contain a dog toy? " + targetCart2.contains(item5));
		System.out.println("Testing remove dog toy item: " + targetCart2.remove(item5));
		System.out.println("Does the cart contain a dog toy? " + targetCart2.contains(item5));
		System.out.println("Remove an unspecified item: " + targetCart2.remove());
		System.out.println();
				
		//Returns array of items currently in the cart
		System.out.println("The shopping cart contains the following item(s):");		
		Object[] ArrayBag = targetCart2.toArray();
				
			for (int index = 0; index < ArrayBag.length; index++) {
				
					System.out.print(ArrayBag[index] + "\n");
					
			} // end for
			
				System.out.println();
				
		//Returns current size of cart 
		System.out.println("Testing current size of the shopping cart: " + targetCart2.getCurrentSize());
		System.out.println();
				
		//Testing save cart on specified item (candle)
		System.out.println("Testing save to cart with a specified item: ");
		targetCart2.save(item1);
		System.out.println();
						
		//Testing total price of items in the cart
		System.out.println("Testing total price of items in cart: " + targetCart2.getTotalPrice());
		System.out.println();
				
		//Testing clear cart and returning true for isEmpty
		targetCart2.clear();
		System.out.println("Testing clear with items in the cart: " + targetCart2.isEmpty());

	}//end main

}//end class
