/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * UseBook.java
 * 
 * Inheritance and Abstract Lab 1
 */
package proj;

import java.util.Scanner;

public class UseBook {

	public static void main(String[] args) {
		
		//create a scanner obj to get input from the user
		Scanner input = new Scanner(System.in);
		
		String title = "";
		
		System.out.println("==================Fiction==================");
		
		System.out.print("Please enter in the title of a Fiction book: ");
		title = input.nextLine();
		
		//create a fiction book obj
		Book book = new Fiction(title);
		
		//display its information
		book.display();
		
		System.out.println("\n=================NonFiction=================");
		
		System.out.print("Please enter in the title of a NonFiction book: ");
		title = input.nextLine();
		
		//create a non-fiction book obj
		book = new NonFiction(title);
		
		//display its information
		book.display();
		
		//close the scanner object
		input.close();
	}
	

}

/*
==================Fiction==================
Please enter in the title of a Fiction book: Moby Dick

Title: Moby Dick
Price: 24.99

=================NonFiction=================
Please enter in the title of a NonFiction book: Autobiography of Tony Hawk

Title: Autobiography of Tony Hawk
Price: 37.99
*/