package ADT;
/**
Interface that creates ADT by using ResizableArrayBag Data Structure
@author Greg Gutierrez
@CS 215
*/

	public interface ShoppingCartInterface <T>{

		/*
		 * Gets the number of items in the shopping cart
		 * @return an integer of amount of items in cart
		 * 
		 */
		public int getCurrentSize();
		
		/*
		 * Sees whether bag is empty
		 * @return true if bag is empty, false if not
		 * 
		 */
		
		public boolean isEmpty();
		
		/*
		 * adds a new item to the shopping cart
		 * @param anItem new object to be added to cart
		 * @return  true is addition was successful,return false if not
		 * 
		 */
		public boolean add(T nextItem);
		
		/*
		 * removes one unspecified object from the shopping cart, if possible
		 * 
		 * @return  if the removal was successful return object,or null if 
		 * 
		 */
		public T remove();
		
		/*
		 * removes one occurance of an object from the shopping cart, if possible
		 * @param the item to be remove
		 * @return  true if removal was successful,false if not 
		 * 
		 */
		public boolean remove(T anItem);
		
		/*
		 * clears all items/objects from the shopping cart
		 * 
		 */
		public void clear();
		
		
		
		/*
		 * counts the amount of times a an object appears in shopping cart
		 * @param anItem the object to be counted
		 * @return the count of the amount of times anItem appears in shopping cart
		 */
		public int getFrequencyOf(T anItem);
		
		/*
		 * checks if this shopping cart contains a specific item
		 * @param anItem/object to be test
		 * @return if true if the item is found in cart,false if not
		 */
		
		public boolean contains(T anItem);
		
		
		/*
		 * puts all items found in shopping cart in an array
		 * @return all items/objects in shopping in an array
		 */
		
		public T[] toArray();
		
		

	}//end shopping cart interface
