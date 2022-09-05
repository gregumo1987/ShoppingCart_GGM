/**
Application class that instantiates a ResizableArrayBay and this ResizableArrayBag is used to construct a new ShoppingCart
This class acts as a test class to test ShoppingCart class/ShoppingCartInterace/ResizableArrayBag data Structure
@author Greg Gutierrez
@CS 215
*/



package ADT;
import java.util.Arrays;


public class ShoppingCartApplication {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResizableArrayBag bag= new ResizableArrayBag(10);
		ShoppingCart mycart= new ShoppingCart(bag);
		
		
		
		Fruit fruit1= new Fruit("Strawberries", 11123,3.50,true);//Instantiates new fruit
		
		Item item1=new Item("Trash Bags", 23421,4.25);//instantiates new Item called Trash Bags
		
		Fruit fruit2=new Fruit("Orange", 32167,1.25,false);// instantiates new fruit
		
		Item item2= new Item("eggs",66632,2.33);//instantiates new item 
		
		Item item3= new Item("beans", 33284,1.99 );//instantiates beans
	
		System.out.println("**************************Add() method Test**************************");
		
		
		System.out.println(mycart.add(fruit1));//adding Strawberries fruit 1 to cart
		
		System.out.println(mycart.add(fruit1));//adding duplicates testing logic
	 
		System.out.println(mycart.add(item1));//adding trash bags to cart
		
		System.out.println(mycart.add(item2));//adding eggs to the cart
		System.out.println(mycart.add(item3));//adding beans to cart
		
		System.out.println(mycart.add(fruit2)+"\n");//adding Orange to cart
		
		
		
		System.out.println("**************************toArray() method Test**************************");
		Object[] myCartToArr=mycart.toArray();//have to create an alias of the shopping cart mycart and rename it
		System.out.println(Arrays.toString(myCartToArr)+"\n");//printing out the shopping cart in as an array
		
		
		
		System.out.println("**************************getCurrentSize() method Test**************************");
		System.out.println(mycart.getCurrentSize()+"\n");/// testing getCurrentSize method
		
		
		
		System.out.println("**************************getFrequencyOf() method Test Getting frequency of Strawberries**************************");
		System.out.println(mycart.getFrequencyOf(fruit1)+"\n");//testing getfFrequencyOf method of items in cart
		
		
		
		System.out.println("**************************contains() method Test checking for Strawberries**************************");
		System.out.println(mycart.contains(fruit1)+"\n");//testing to see if the cart contains fruit1 
		
		System.out.println("**************************clearing cart with clear() method Test**************************\n");
		mycart.clear();
		
		
		System.out.println("**************************isEmpty() method Test**************************");
		System.out.println(mycart.isEmpty()+"\n");//testing isEmpty method
			
		System.out.println("**************************adding  trash bags, beans,and strawberries,eggs back to cart with add() method Test**************************");
		
		System.out.println(mycart.add(item1));//adding trash bags to cart
		System.out.println(mycart.add(fruit1));
		System.out.println(mycart.add(item2));//adding eggs to the cart
		System.out.println(mycart.add(item3));//adding beans
		
		System.out.println("**************************Removing Specified Object with Remove() method Test**************************");
		System.out.println(mycart.remove(fruit1)+"\n");///testing removing specified object fruit from shoppingcart
		
		
		
		System.out.println("**************************Removing unspecified Object with Remove() method Test**************************");
		System.out.println(mycart.remove()+"\n");//testing removing unspecified
		
		
		System.out.println("How many strawberries are in the cart now?");
		System.out.println(mycart.getFrequencyOf(fruit1));
		
	
		

		System.out.println("**************************toArray() method Test**************************");
		Object[] myCartToArr1=mycart.toArray();//have to create an alias of the shopping cart mycart and rename it
		System.out.println(Arrays.toString(myCartToArr1)+"\n");//printing out the shopping cart in as an array
		
		System.out.println("**************************getTotalPrice() method Test**************************");
		System.out.println(mycart.getTotalPrice(bag)+"\n");//testing GetTotalPrice method
		
		} // end main


}//end class