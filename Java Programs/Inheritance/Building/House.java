/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * house.java
 * 
 * Program that creates a house class and inherits the building class
 */
package proj1;

public class House extends Building{
	
	//private data members
	private int numBedrooms;
	private int numBathrooms;
	
	//default constructor
	public House() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
	}
	
	//parameterized constructor
	public House (int numFloors, int numRooms, float sqrFootage, int numBedrooms, int numBathrooms) {
		super(numFloors, numRooms, sqrFootage);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
	}
	
	//parameterized constructor
	public House (int numBedrooms, int numBathrooms) {
		super();
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
	}
	
	//copy constructor
	public House (House h) {
		this.numFloors = h.numFloors;
		this.numRooms = h.numRooms;
		this.sqrFootage = h.sqrFootage;
		this.numBedrooms = h.numBedrooms;
		this.numBathrooms = h.numBathrooms;
	}
	
	
	//setter
	public void setNumBedrooms(int rooms) {
		numBedrooms = rooms;
	}
	
	public void setNumBathrooms(int rooms) {
		numBathrooms = rooms;
	}
	
	
	//getter
	public int getNumBedrooms() {
		return numBedrooms;
	}
	
	public int getNumBathrooms() {
		return numBathrooms;
	}
	
	//toString function
	public String toString() {
		return (super.toString() +
				"\nNumber of Bedrooms: " + numBedrooms
				+ "\nNumber of Bathrooms: " + numBathrooms);
	}
}
