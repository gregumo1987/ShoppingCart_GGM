/**
Class that creates a fruit object that will be able to actions on with shoppingcart extends Item
@author Greg Gutierrez
@CS 215
*/

package ADT;

public class Fruit extends Item {

	boolean fresh;

	/** Creates a fruit */
	public Fruit() {
		super();
		this.fresh = true;
	}
	/** Creates a fruit with preferred constructor. 
	 * @param f name of fruit
	 * @param serialNum Serial Number of fruit
	 * @param pr price of fruit
	 *  
	 *  */
	public Fruit(String f,int serialNum, double pr, boolean fr) {
		super(f, serialNum, pr);
		this.fresh=fr;
		// TODO Auto-generated constructor stub
	}
	
	/** Checks to see if fruit is fresh or not. 
	 * 
	 * @return true if fruit is fresh, false if not
	 *  
	 *  */

	public boolean isFresh() {
		return fresh;
	}
	/** Sets freshness of fruit 
	 * @param fresh true if the fruit is fresh, false if not
	 *  
	 *  */
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}


	
	
}//end Fruit class