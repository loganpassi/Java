/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * MountainBike.java
 * 
 * Code that inherits the Bicycle class and creates a MountainBike class
 */
package proj1;

public class MountainBike extends Bicycle{
	
	public int seatHeight;
	
	//parameterized constructor
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public String toString() {
		return(super.toString() + "\nSeat Height is " + seatHeight);
	}
}
