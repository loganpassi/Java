/*
 * Logan Passi
 * CIS2571
 * 04/23/19
 * Sample1.java
 * 
 * This program demonstrates Error Exceptions
 */
package proj1;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		boolean done = false;
		
		System.out.print("Please enter in two integers: ");
		while(!done) {
			try {
				num1 = input.nextInt();
				num2 = input.nextInt();
				done = true;
				
			}
			
			catch (Exception ex) {
				System.out.print("Incorrect input and re-enter two integers: ");
				input.nextLine(); //discard input
			}
		}
		
		System.out.println("Sum is: " + (num1 + num2));
		
		input.close();

	}
	
}
