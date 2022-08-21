package application;
/**
 * This main class is used to print all the information from animal and each subclass
 * @author James Frayser
 * Final Programming Project
 * CS131ON
 * Application.java
 */

import java.util.ArrayList;

import animalSim.*;

public class Application {

	public static void main(String[] args) {
		
		/**
		 * establishing objects to print later
		 */
		Goldfinch g = new Goldfinch();
		BrownBear bb = new BrownBear();
		Location loc = new Location();
		
		/**
		 * generating the array list that can conatin any animal type
		 */
		ArrayList<>  = new ArrayList<>();
		Location newLocation = new Location();
		
		//add objects to the Animal ArrayList
		
		/**
		 * printing all the Location tests
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     Location Tests				 \n");
		System.out.println("      " +loc.toString());
		System.out.println("Goldfinch Location: " +);
		System.out.println("BrownBear Location: " +);
		System.out.println("");
		System.out.println("*********************************************\n");
		
		/**
		 * printing the fact that animal is abstract and can't be instantiated
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     ANIMAL TESTS				 \n");
		System.out.println("Animal Is abstract and can't be instantiated ");
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
		/**
		 * printing all the Goldfinch tests
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     Goldfinch Tests				 \n");
		System.out.println();
		System.out.println("The Goldfinch has eaten");
		System.out.println();
		System.out.println("The Goldfinch has rested");
		System.out.println();
		System.out.println("Goldfinch Location: " +);
		System.out.println("The Goldfinch has walked up");
		System.out.println("Goldfinch Location: " +);
		System.out.println("The Goldfinch has flown");
		System.out.println("Goldfinch Location: " +);
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
		/**
		 * printing all the BrownBear tests
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     BrownBear Tests				 \n");
		System.out.println();
		System.out.println("The BrownBear has eaten");
		System.out.println();
		System.out.println("The BrownBear has rested");
		System.out.println();
		System.out.println("BrownBear Location: " +);
		System.out.println("The BrownBear has walked up");
		System.out.println("BrownBear Location: " +);
		System.out.println("The BrownBear has swam up");
		System.out.println("BrownBear Location: " +);
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
		/**
		 * printing all the Generics tests
		 */
		System.out.println("*********************************************\n");

		System.out.println("	     Generics Tests				 \n");
		for(//arraylist a : //arraylist name) {
			System.out.println(a.toString());
		}
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
	}//end main

}//end class
