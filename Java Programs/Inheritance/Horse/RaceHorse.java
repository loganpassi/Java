/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * RaceHorse.java
 * 
 * Short program that inherits data from the Horse.java file and creates a RaceHorse class
 */
package proj1;

public class RaceHorse extends Horse{
	
	//private data member
	private int completedRaces;
	
	//default constructor
	public RaceHorse() {
		super();
		completedRaces = 0;
		
	}
	
	//parameterized constructor
	public RaceHorse(String name, String color, int birthYear, int completedRaces) {
		super(name, color, birthYear);
		this.completedRaces = completedRaces;
	}
	
	//setter
	public void setRaces(int r) {
		completedRaces = r;
	}
	
	//getter
	public int getRaces() {
		return completedRaces;
	}
	
	//toString function
	public String toString() {
		return (super.toString() + "\nCompleted Races: " + completedRaces);
	}

}
