package ADT;
/**
   A class that creates an item to eventually be put into shopping cart
	
   @author Greg Gutierrez
 @CS 215 
*/
public class Item {

	private String name;
	private int serialNumber;
	private  double price;
	
	
	/** Creates an Item  */
public Item() {
	this.name=null;
	this.serialNumber=0;
	this.price=0;
	
	
}//end empty argument constructor

/** Creates an Item with preferred constructor. 
 * @param nme name of item
 * @param serialNum Serial Number of Item
 * @param pr price of Item 
 *  
 *  */
public Item(String nme, int serialNum, double pr) {
	this.name=nme;
	this.serialNumber=serialNum;
	this.price=pr;
	
}//end preferred constructor


//setters and getters


/**Returns name of Item
 * @return name
 *  
 *  */
public String getName() {
	return name;
}
/**Sets name of Item
 * @param name 
 * 
 *  
 *  */

public void setName(String name) {
	this.name = name;
}

/**Gets Serial Number of Item
 *
 * @return serialNumber returns serial number of item
 *  
 *  */
public int getSerialNumber() {
	return serialNumber;
}
/**Sets Serial Number of Item
*
* @param serialNumber sets serial number of item
*  
*  */

public void setSerialNumber(int serialNumber) {
	this.serialNumber = serialNumber;
}
/**Gets price of Item
*
* @return price gets price of item
*  
*  */

public double getPrice() {
	return price;
}
/**sets price of Item
*
* @param price gets price of item
*  
*  */

public void setPrice(double price) {
	this.price = price;
}


/**puts all contents of item into a string//for printing purposes
*
*  
*  */

@Override
public String toString() {
	return "Item [name=" + name + ", serialNumber=" + serialNumber + ", price=" + price+"]";
			
}

}//end class