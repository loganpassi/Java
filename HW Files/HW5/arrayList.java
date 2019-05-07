/*
 * Logan Passi
 * CIS2571
 * 02/26/2019
 * arrayList.java
 * 
 * Simple program that utilizes Java's ArrayList
 */

package proj1;

import java.util.ArrayList; //for ArrayList object
import java.util.Scanner; //to get input from the user
import java.util.Collections; //to sort the array in ascending order

public class arrayList {

	public static void main(String[] args) {
		
		double temp = 0.0, sum = 0.0;
		final int MAX_SIZE = 10; //constant value to hold the max size of the array
		
		Scanner input = new Scanner(System.in);
		ArrayList<Double> dblArr = new ArrayList<Double>(); //create the ArrayList object
		
		System.out.println("Please enter in 10 numbers.");
		
		for(int i = 0; i < MAX_SIZE; ++i) { //loop through the array and get input for each element
			System.out.print("\nElement " + i + ": ");
			temp = input.nextDouble();
			sum += temp;
			
			dblArr.add(temp); //add the current value to the array
		}
		
		System.out.println("\n==================================");
		
		Collections.sort(dblArr); //sort the array in ascending order
		
		calcAndDisplay(dblArr, sum);
		
		
	}
	
	
	//function to calculate and display the average, elements in ascending order, smallest value and largest value
	public static void calcAndDisplay (ArrayList<Double> arr, double s) {
		
		double average = s / arr.size(); //calculate average
		
		for (int i = 0; i < arr.size(); ++i) //loop through the array and output all the elements
			System.out.println("\nElement " + i + ": " + arr.get(i));
		
		System.out.println("\nSmallest Value: " + arr.get(0));
		System.out.println("Largest Value: " + arr.get(arr.size() - 1));
		System.out.println("Average: " + average);
	}
		

}

/*
 * Please enter in 10 numbers.

Element 0: 52

Element 1: 65

Element 2: 89

Element 3: 12

Element 4: -9

Element 5: 59

Element 6: 598

Element 7: 45

Element 8: 215

Element 9: 32

==================================

Element 0: -9.0

Element 1: 12.0

Element 2: 32.0

Element 3: 45.0

Element 4: 52.0

Element 5: 59.0

Element 6: 65.0

Element 7: 89.0

Element 8: 215.0

Element 9: 598.0

Smallest Value: -9.0
Largest Value: 598.0
Average: 115.8
*/
