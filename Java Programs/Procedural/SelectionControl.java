/*
 * Logan Passi
 * CIS2571
 * 02/05/2019
 * SelectionControl.java
 * 
 * This Program demonstrates how to use selection structures
 */
package p1;
import java.util.Scanner;

public class SelectionControl {

	public static void main(String[] args) {
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in your age: ");
		age = input.nextInt();
		
		/*
		switch (age) {
		
		case 18:
			System.out.println("You are 18 - great!\nWelcome to adulthood!");
			break;
			
		case 19:
			System.out.println("Excellent you are 20 years old!\nWelcome to the wold of twenties!");
			break;
			
		case 50:
			System.out.println("Welcome to the world of wisdom!");
			break;
			
		default:
			System.out.println("Not sure of your age?");
			break;
		}*/
		
		if (age >= 18 && age <= 35) {
			System.out.println("Between 18 - 35");
		}
		
		else if (age > 35 && age <= 60) {
			System.out.println("Between 36 - 60 ");
		}
		
		else {
			System.out.println("Does not match!");
			System.out.println("Program checks between 18 - 35\nor between 36 - 60");
		}
		
		input.close();
	}

}

/*
 * Please enter in your age: 25
 * Between 18 - 35
 * 
 * Please enter in your age: 40
 * Between 36 - 60 
 * 
 * Please enter in your age: 78
 * Does not match!
 * Program checks between 18 - 35
 * or between 36 - 60
 * 
 */
