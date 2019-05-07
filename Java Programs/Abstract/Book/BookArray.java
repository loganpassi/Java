/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * BookArray.java
 * 
 * Inheritance and Abstract Lab 1
 */
package proj;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BookArray{


	public static void main(String[] args) {
		
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		//create an arrayList obj
		List<Book> bookArr = new ArrayList<>();
		
		//max amount of books to hold in array
		final int MAX = 10;
		int bookType = 0;
		String title = "";
		Book bk = new Fiction();
		
		//loop 10 times to make an arrayList of 10 book objects
		for (int i = 0; i < MAX; ++i) {
			System.out.print("\nAre you entering in a Fiction(0) or NonFiction(1) book? ");
			bookType = input.nextInt();
			//input.nextLine(); //clear the \n from the buffer
			
			if (bookType == 0) {
				System.out.print("Please enter in the title of the Fiction book: ");
				title = input.next();
				bk = new Fiction(title);//create a fiction object
			}
			
			else {
				System.out.print("Please enter in the title of the NonFiction book: ");
				title = input.next(); //get the title from the user
				bk = new NonFiction(title);//create a fiction object
			}
			
			input.nextLine(); //clear the \n from the buffer
			bookArr.add(bk); //add the object to the array
		}
		
		for (int i = 0; i < MAX; ++i) {
			bookArr.get(i).display();
		}
		
		input.close();
	}

}

/*
Are you entering in a Fiction(0) or NonFiction(1) book? 0
Please enter in the title of the Fiction book: Spiderman

Are you entering in a Fiction(0) or NonFiction(1) book? 0
Please enter in the title of the Fiction book: Harrypotter

Are you entering in a Fiction(0) or NonFiction(1) book? 1
Please enter in the title of the NonFiction book: Dogs

Are you entering in a Fiction(0) or NonFiction(1) book? 1
Please enter in the title of the NonFiction book: Cats

Are you entering in a Fiction(0) or NonFiction(1) book? 1
Please enter in the title of the NonFiction book: Frogs

Are you entering in a Fiction(0) or NonFiction(1) book? 0
Please enter in the title of the Fiction book: James and the Giant Peach

Are you entering in a Fiction(0) or NonFiction(1) book? 0
Please enter in the title of the Fiction book: Flat Earth

Are you entering in a Fiction(0) or NonFiction(1) book? 1
Please enter in the title of the NonFiction book: Butterflies

Are you entering in a Fiction(0) or NonFiction(1) book? 1
Please enter in the title of the NonFiction book: Worms

Are you entering in a Fiction(0) or NonFiction(1) book? 0
Please enter in the title of the Fiction book: Wizards

Title: Spiderman
Price: 24.99

Title: Harrypotter
Price: 24.99

Title: Dogs
Price: 37.99

Title: Cats
Price: 37.99

Title: Frogs
Price: 37.99

Title: James
Price: 24.99

Title: Flat
Price: 24.99

Title: Butterflies
Price: 37.99

Title: Worms
Price: 37.99

Title: Wizards
Price: 24.99
*/
