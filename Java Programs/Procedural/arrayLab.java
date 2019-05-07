/*
 * Logan Passi
 * CIS2571
 * 02/26/2019
 * arrayLab.java
 * 
 * Simple program that utilizes arrays and gets input from the user,
 * calculate the average, and display the distance each number is from that
 * average.
 */

package proj1;

import java.util.Scanner; //for input from the user
import java.text.*; //to format the number output

public class arrayLab {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] arr; //make an array that can hold the data type of a double
		double sum = 0.0;
		
		final int MAX_SIZE = 20; //constant to hold the max size of the array
		
		arr = new double[MAX_SIZE];
		
		System.out.println("Please enter in the data for each element...\nEnter 99999 to end!");

		for (int i = 0; i < MAX_SIZE; ++i) { //get input from the user for the array
			System.out.print("Element " + i + ": ");
			arr[i] = input.nextDouble();
			
			
			while (arr[i] == 99999.0 && i == 0) { //while loop to make sure that the first value is not 99999
				
				System.out.println("\nYou cannot exit without entering in any values!");
				System.out.println("Please enter in the data for each element...\nEnter 99999 to end!\n");
				System.out.print("Element " + i + ": ");
				arr[i] = input.nextDouble();
			}
			
			if(arr[i] == 99999.0) { //checks to see if the current element is holding the value of 99999
			
				System.out.println("\nClosing input...");
				input.close(); //close the scanner
				calcAndDisplay(sum, arr, i);//call the calcAndDisplay function
			}
			else //if the current element is not 99999 add the current element's number to the total
				sum += arr[i];
		}
		
		System.out.println("\nClosing input...");
		input.close(); //close the scanner
		
		calcAndDisplay(sum, arr, MAX_SIZE);//call the calcAndDisplay function
		
		
	}
	
	//function to calculate the average and display each element, its data and how far it is from the average
	public static void calcAndDisplay(double sum, double[] a, int size) {
		
		DecimalFormat twoDeci = new DecimalFormat("0.00"); //create a DecimalFormat object to restrict the output to two decimal places
		double average = sum / size;
		
		for (int i = 0; i < size; ++i) { //loop through the elements of the array
			
			System.out.println("\nElement " + i + ": " + a[i]);
			System.out.println("Distance from average (" + twoDeci.format(average)+ ") "	
					+ twoDeci.format(Math.abs(a[i] - average)) + "\n");
		}
		System.exit(0); //exit the program
		
	}

}


/*
 *Please enter in the data for each element...
Enter 99999 to end!
Element 0: 99999

You cannot exit without entering in any values!
Please enter in the data for each element...
Enter 99999 to end!

Element 0: 99999

You cannot exit without entering in any values!
Please enter in the data for each element...
Enter 99999 to end!

Element 0: 99999

You cannot exit without entering in any values!
Please enter in the data for each element...
Enter 99999 to end!

Element 0: 56
Element 1: 25
Element 2: 12
Element 3: 65
Element 4: 89
Element 5: 96
Element 6: 32
Element 7: 99999

Closing input...

Element 0: 56.0
Distance from average (53.57) 2.43


Element 1: 25.0
Distance from average (53.57) 28.57


Element 2: 12.0
Distance from average (53.57) 41.57


Element 3: 65.0
Distance from average (53.57) 11.43


Element 4: 89.0
Distance from average (53.57) 35.43


Element 5: 96.0
Distance from average (53.57) 42.43


Element 6: 32.0
Distance from average (53.57) 21.57
*/
