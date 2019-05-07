/*
 * Logan Passi
 * CIS2571
 * 04/23/19
 * NegativeArray.java
 * 
 * Exception Lab 1
 */
package proj1;

import java.util.Scanner; //import needed to create a scanner object

public class NegativeArray {

	public static void main(String[] args) {
		
		int testArr[]; //declare the array
		
		String arrSizeStr = "";
		int arrSize = 0;
		
		Scanner input = new Scanner(System.in); //create scanner obj
		
		System.out.print("Please enter the size of the array: ");
		arrSizeStr = input.nextLine(); //get the size of the array from the user
		
		try {//try to parse it to an int
			arrSize = Integer.parseInt(arrSizeStr);
		}
		
		//if parseing it to an int doesn't work check to see if it is a number
		catch(NumberFormatException ex) {
			notCreated(arrSizeStr);
		}
		
		try {
			//if it not a nonnumber try to allocate the memory for it
			testArr = new int[arrSize];
		}
		
		//if it is a number, check to see if it is a negative number
		catch(NegativeArraySizeException ex) {
			notCreated(arrSizeStr);
		}
		
		System.out.println("The array was succesfully created and has a length of " + arrSize + ".");
		
		//close the scanner obj
		input.close();
		
		

	}
	
	//function to output the incorrect input and inform the user that the array was not created
	public static void notCreated(String s) {
		System.out.println("The array was not created.\n" + s + " is not valid input.");
		System.exit(1);
		
	}
	

}
/*
Please enter the size of the array: 5
The array was succesfully created and has a length of 5.

Please enter the size of the array: 2m
The array was not created.
2m is not valid input.

Please enter the size of the array: t
The array was not created.
t is not valid input.

Please enter the size of the array: -9
The array was not created.
-9 is not valid input.
*/
