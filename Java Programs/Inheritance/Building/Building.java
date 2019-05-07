/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * building.java
 * 
 * Program that creates a building class
 */
package proj1;

public class Building {
	
	//protected data members
	protected int numFloors;
	protected int numRooms;
	protected double sqrFootage;
	
	//default constructor
	public Building() {
		numFloors = 0;
		numRooms = 0;
		sqrFootage = 0F;
	}
	
	//parameterized constructor
	public Building(int numFlrs, int numRms, float sqrFtg) {
		numFloors = numFlrs;
		numRooms = numRms;
		sqrFootage = sqrFtg;
	}
	
	//copy constructor
	public Building(Building b) {
		this.numFloors = b.numFloors;
		this.numRooms = b.numRooms;
		this.sqrFootage = b.sqrFootage;
	}
	
	//setters
	public void setFloors(int numFlrs) {
		numFloors = numFlrs;
	}
	
	public void setRooms(int numRms) {
		numRooms = numRms;
	}
	
	public void setTotSqFt(double sqrFtg) {
		sqrFootage = sqrFtg;
	}
	
	
	//getters
	public int getFloors() {
		return numFloors;
	}
	
	public int getRooms() {
		return numRooms;
	}
	
	public double getSqrFootage() {
		return sqrFootage;
	}
	
	//toString Function
	public String toString() {
		return ("\nNumber of Floors: " + numFloors
				+ "\nNumber of Rooms: " + numRooms
				+ "\nSquare Footage: " + sqrFootage);
	}
	
	

}
