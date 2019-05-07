/*
 * Logan Passi
 * CIS2571
 * 04/09/19
 * LuxuryCarRental.java
 * 
 * Program that creates a LuxuryCarRental class that extends from the 
 * CarRental class.
 */

public class LuxuryCarRental extends CarRental {
	
	//protected data members
	protected double dailyFee;
	protected boolean chauffeur;
	
	//default constructor
	public LuxuryCarRental() {
		super();
		dailyFee = 79.99;
		chauffeur = false;
	}

	
	//setters
	public void setChauf(int b) {
		if (b == 1) {
			chauffeur = true;
			ttlFee += 200;
		}

		else
			chauffeur = false;
		
		calcFee();
	}
	
	//getters
	public double getChauf() {
		if (chauffeur)
			return 200.d;
		else
			return 0.0d;
	}
	
	public void calcFee() {
		ttlFee += dailyFee * daysRented;
	}
	//function to display all data
	public void display() {
		System.out.println(
		"\nRenter's Name: " + renterName
		+ "\nZip Code: " + zipCode
		+ "\nDays Rented: " + daysRented
		+ "\nChauffeur: $" + this.getChauf()
		+ "\nDaily Fee: $" + dailyFee
		+ "\nTotal Fee: $" + twoDeci.format(ttlFee));
		
	}

}
