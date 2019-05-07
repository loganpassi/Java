/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * Horse.java
 * 
 * Program that creates a Horse class
 */
package proj1;

public class Horse {
	
	//protected data members
	protected String name;
	protected String color;
	protected int birthYear;
	
	//default constructor
	public Horse() {
		name = "";
		color = "";
		birthYear = 0;
	}
	
	//parameterized constructor
	public Horse(String n, String c, int bY) {
		name = n;
		color = c;
		birthYear = bY;
	}
	
	//setters
	public void setName(String n) {
		name = n;
	}
	
	public void setColor(String c) {
		color = c;
	} 
	
	public void setBirthYear (int bY) {
		birthYear = bY;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	//toString function
	public String toString() {
		return ("\nName: " + name
				+ "\nColor: " + color
				+ "\nBirth Year: " + birthYear);
	}

}
