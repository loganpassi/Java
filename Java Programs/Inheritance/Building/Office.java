/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * office.java
 * 
 * Program that creates a office class and inherits the building class
 */
package proj1;

public class Office extends Building{
	
	//private data members
	private int numExtinguish;
	private int numPhone;
	
	//default constructor
	public Office () {
		super();
		numExtinguish = 0;
		numPhone = 0;
	}
	
	//parameterized constructor
	public Office (int numFloors, int numRooms, float sqrFootage, int numExtinguish, int numPhone) {
		super(numFloors, numRooms, sqrFootage);
		this.numExtinguish = numExtinguish;
		this.numPhone = numPhone;
	}
	
	//parameterized constructor
	public Office (int numExtinguish, int numPhone) {
		super();
		this.numExtinguish = numExtinguish;
		this.numPhone = numPhone;
	}
	
	
	//copy constructor
	public Office (Office off) {
		this.numFloors = off.numFloors;
		this.numRooms = off.numRooms;
		this.sqrFootage = off.sqrFootage;
		this.numExtinguish = off.numExtinguish;
		this.numPhone = off.numPhone;
	}
	
	//setters
	public void setNumExtinguish(int e) {
		numExtinguish = e;
	}
	
	public void setNumPhone(int p) {
		numPhone = p;
	}
	
	//getters
	public int getNumExtinguish() {
		return numExtinguish;
	}
	
	public int getNumPhone() {
		return numPhone;
	}
	
	//toString function
	public String toString() {
		return (super.toString() +
				"\nNumber of Fire Extinguishers: " + numExtinguish +
				"\nNumber of Telephones: " + numPhone);
	}

}
