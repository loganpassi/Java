/*
 * Logan Passi
 * CIS2571
 * 04/09/19
 * CarRental.java
 * 
 * Program that creates a CarRental class
 */

import java.text.*;

public class CarRental {
	
	DecimalFormat twoDeci = new DecimalFormat();
	
	//Protected data members
	protected String renterName;
	protected int zipCode;
	protected int daysRented;
	protected enum carSize {ECONOMY, MIDSIZE, FULLSIZE, LUXURY};
	protected carSize size = carSize.ECONOMY;
	protected double dailyFee;
	protected double ttlFee;
	
	//default constructor
	public CarRental() {
		renterName = "";
		zipCode = 0;
		daysRented = 0;
		calcSize(1);
		dailyFee = 0F;
		ttlFee = 0F;
	}
	
	//parameterized constructor
	public CarRental(String name, int zip, int days, int s) {
		renterName = name;
		zipCode = zip;
		daysRented = days;
		calcSize(s);

	}
	
	//function that determines the size based off the number inputed and calls
	//calcFee function to determine the total fee
	public void calcSize(int s) {
		
		switch(s) {
	
		case 1:
			size = carSize.ECONOMY;
			dailyFee = 29.99;
			calcFee(daysRented, dailyFee);
			break;
		
		case 2:
			size = carSize.MIDSIZE;
			dailyFee = 38.99;
			calcFee(daysRented, dailyFee);
			break;
		
		case 3:
			size = carSize.FULLSIZE;
			dailyFee = 43.50;
			calcFee(daysRented, dailyFee);
			break;
		
		case 4:
			size = carSize.LUXURY;
			;dailyFee = 79.99;
			calcFee(daysRented, dailyFee);
			break;
			
		}
	}
	
	//function to calculate the total fee
	public void calcFee(int days, double dailyFee) {
			ttlFee = days * dailyFee;
			
	}
	
	
	//setters
	public void setName(String n) {
		renterName = n;
	}
	
	public void setZip(int z) {
		zipCode = z;
	}
	
	public void setDays(int d) {
		daysRented = d;
	}
	
	public void setSize(int s) {
		calcSize(s);
	}
	
	

	//getters
	
	public String getName() {
		return renterName;
	}
	
	public int getZip() {
		return zipCode;
	}
	
	public int getDays() {
		return daysRented;
	}
	
	public String getSize() {
		return size.toString();
	}
	
	public double getDFee() {
		return dailyFee;
	}
	
	public double getTtlFee() {
		return ttlFee;
	}
	
	
	//function to display all data
	public void display() {
		System.out.println(
				"\nRenter's Name: " + renterName
				+ "\nZip Code: " + zipCode
				+ "\nDays Rented: " + daysRented
				+ "\nCar Size: " + size.toString()
				+ "\nDaily Fee: $" + dailyFee
				+ "\nTotal Fee: $" + twoDeci.format(ttlFee));
	}
	
	public String toString() {
		return("\nRenter's Name: " + renterName
				+ "\nZip Code: " + zipCode
				+ "\nDays Rented: " + daysRented
				+ "\nCar Size: " + size.toString()
				+ "\nDaily Fee: $" + dailyFee
				+ "\nTotal Fee: $" + twoDeci.format(ttlFee));
	}
}
