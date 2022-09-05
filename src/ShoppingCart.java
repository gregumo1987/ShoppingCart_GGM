/**
   A class that creates shoppingcart implements methods in ShoppingCartInterface.
@author Greg Gutierrez
@CS 215
*/


package ADT;

public  class ShoppingCart implements ShoppingCartInterface{

	ResizableArrayBag bag;

	/** Creates a ShoppingCart using ResizableArrayBag data structure. */
	public ShoppingCart(ResizableArrayBag bag) {
	
		this.bag = bag;
	}//end preferred constructor



	/** implements getCurrentSize () from ShoppingCartInterface
	    @returns capacity of shoppingcart*/
	@Override
	public int getCurrentSize() {
				return bag.getCurrentSize();
	}
	/** implements isEmpty () from ShoppingCartInterface
    @returns true if bag is empty,false if not*/
	@Override
	public boolean isEmpty() {
		
		return bag.isEmpty();
	}
	/** implements add() from ShoppingCartInterface
    @returns Object to be added to cart*/
	@Override
	public boolean add(Object nextItem) {
		
		return bag.add(nextItem);
	}
	/*
	 * removes one unspecified object from the shopping cart, if possible
	 * 
	 * @return  if the removal was successful return object,or null if 
	 * 
	 */
	public Object remove() {
		
		return bag.remove();
	}

	/*
	 * removes one occurance of an object from the shopping cart, if possible
	 * @param the item to be remove
	 * @return  true if removal was successful,false if not 
	 * 
	 */
	@Override
	public boolean remove(Object anItem) {
		
		return bag.remove(anItem);
	}
	/*
	 * clears all items/objects from the shopping cart
	 * 
	 */
	@Override
	public void clear() {
		 bag.clear();
		
	}
	/*
	 * counts the amount of times a an object appears in shopping cart
	 * @param anItem the object to be counted
	 * @return the count of the amount of times anItem appears in shopping cart
	 */
	@Override
	public int getFrequencyOf(Object anItem) {
	return	bag.getFrequencyOf(anItem);
	}

	/*
	 * checks if this shopping cart contains a specific item
	 * @param anItem/object to be test
	 * @return if true if the item is found in cart,false if not
	 */
	
	@Override
	public boolean contains(Object anItem) {
		
		return bag.contains(anItem);
	}

	
	/*
	 * puts all items found in shopping cart in an array
	 * @return all items/objects in shopping in an array
	 */
	@Override
	public Object[] toArray() {
		
		return bag.toArray();
	}

	

	/*
	 * puts Resizable ArrayBag into Array and loops through each index inn array and adds the price of all objects in ShoppingCart
	 * @return totalCost the total price all items in shopping cart
	 * @param bg a resizableArraybag  to be looped through
	 */
	
	
	public double getTotalPrice(ResizableArrayBag bg) {
		
		double totalCost = 0;
	   Object[] arr= bg.toArray();
	   
	      // Statements that add selected items to the shopping cart:
	      for (int index = 0; index < arr.length ; index++)
	      {
	         Object nextItem = arr[index]; // Simulate getting item from shopper
	         bg.add( nextItem);
	         totalCost = totalCost + ((Item) nextItem).getPrice();  
	         
	      } // end 

	    return totalCost;
	}


}//end class
