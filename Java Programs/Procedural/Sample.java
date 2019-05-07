/*
 * This program converts quarts to gallons.
 * 
 * Logan Passi
 * CIS 2571
 * 01/29/2019
 * Sample.java
 */

package proj1;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int quartsNeeded;
		double gallonsNeeded;
		final int QUART_IN_GALLON = 4; //can also use 'const' instead of 'final', both make a variable a constant
		int extraQuartsNeeded;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter quarts needed: ");
		quartsNeeded = kb.nextInt();
		
		gallonsNeeded = quartsNeeded / QUART_IN_GALLON;
		extraQuartsNeeded = quartsNeeded % QUART_IN_GALLON;
		
		System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
				gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts.");

	}

}
