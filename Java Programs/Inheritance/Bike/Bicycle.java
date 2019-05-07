/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * Bicycle.java
 * 
 *  Code to create a Bicycle class
 */
package proj1;

public class Bicycle {
	
	//private data members
	protected int gear;
	protected int speed;
	
	//default constructor
	public Bicycle() {
		gear = 5;
		speed = 7;
	}
	
	//parameterized constructor
	public Bicycle(int g, int s) {
		gear = g;
		speed = s;
	}
	
	//function to decrease speed
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	//function to increase speed
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return("Number of Gears are " + gear + "\n"
				+ "Speed of bicycle is " + speed);
	}
	
}
