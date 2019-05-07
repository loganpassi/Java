/*
 * Logan Passi
 * CIS 2571
 * 02/26/2019
 * SampleArray.java
 * 
 * Simple program demonstrating Arrays
 */
package proj1;

import java.util.Scanner;

public class SampleArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int[] arr; //declare an array of integers
		
		arr = new int[5]; //allocating memory for 5 integers
		
		/*
		for (int i = 1; i < arr.length + 1; ++i) { //loop through the array to fill each element 
			
			arr[i - 1] = i * 10;
		}
		*/
		
		
		for (int i = 0; i < arr.length; ++i) { //loop to get input from the user for each element
			
			System.out.print("Please enter in a value for element " + i + ": ");
			arr[i] = input.nextInt();
		}
		
		
		
		for (int i = 0; i < arr.length; ++i) { //loop through the array to display each element
			
			System.out.println("Element at " + i + ": " + arr[i]);
		}
		
		/*
		for (int e:arr) //loops through the array to display each element
			System.out.println(e);
		*/
		
		
		
		

	}

}
