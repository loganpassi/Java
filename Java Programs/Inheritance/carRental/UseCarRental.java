/*
 * Logan Passi
 * CIS2571
 * 04/09/19
 * UseCarRental.java
 * Inheritance Lab 2
 * 
 * Program that uses both CarRental.java and LuxuryCarRental.java
 */

import java.util.Scanner;

public class UseCarRental {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Create a Scanner obj
		
		CarRental car = new CarRental(); //Create a CarRental obj
		LuxuryCarRental luxCar = new LuxuryCarRental(); //Create a LuxuryCarRental obj
		
		System.out.println("\n================CarRental Object================\n");
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		car.setName(name);
		
		System.out.print("\nEnter your Zip Code: ");
		int zip = input.nextInt();
		car.setZip(zip);
		
		System.out.print("\nEnter the amount of days you are renting: ");
		int days = input.nextInt();
		car.setDays(days);
		
		System.out.print("\nChoose Economy(1), Midsize(2), Full Size(3): ");
		int size = input.nextInt();
		car.setSize(size);
		
		car.display();
		
		System.out.println("\n=============LuxuryCarRental Object=============\n");
		
		System.out.print("Enter your name: ");
		input.nextLine();
		name = input.nextLine();
		luxCar.setName(name);
		
		System.out.print("\nEnter your Zip Code: ");
		zip = input.nextInt();
		luxCar.setZip(zip);
		
		System.out.print("\nEnter the amount of days you are renting: ");
		days = input.nextInt();
		luxCar.setDays(days);
		
		
		System.out.print("\nWould you like a chauffeur? Yes(1) No(0): ");
		int c = input.nextInt();
		luxCar.setChauf(c);
		
		luxCar.display();
		
		input.close();
		

	}

}

/*
 *
================CarRental Object================

Enter your name: Logan passi

Enter your Zip Code: 60189

Enter the amount of days you are renting: 3

Choose Economy(1), Midsize(2), Full Size(3): 1

Renter's Name: Logan passi
Zip Code: 60189
Days Rented: 3
Car Size: ECONOMY
Daily Fee: $29.99
Total Fee: $89.97

=============LuxuryCarRental Object=============

Enter your name: Paul Passi

Enter your Zip Code: 60189

Enter the amount of days you are renting: 3

Would you like a chauffeur? Yes(1) No(0): 1

Renter's Name: Paul Passi
Zip Code: 60189
Days Rented: 3
Chauffeur: $200.0
Daily Fee: $79.99
Total Fee: $439.97
*/
