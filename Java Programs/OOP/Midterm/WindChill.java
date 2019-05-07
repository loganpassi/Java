/*
 * Logan Passi
 * CIS2571
 * 03/12/19
 * WindChill.java
 * 
 * Program that creates the class for a WindChill object
 */
package proj1;

public class WindChill {
	
	//private data members
	private double temp;
	private double windSpd;
	private double windChillIndex;
	
	
	//default constructor
	public WindChill() {
		temp = 0.0;
		windSpd = 2.0;
		calcWindChillIndex();
	}
	
	
	//parameterized constructor
	public WindChill(double t, double w) {
		temp = t;
		windSpd = w;
		calcWindChillIndex();

	}
	
	//setters
	public void setTemp(double t) {
		temp = t;
		calcWindChillIndex();
	}
	
	public void setWindSpd(double w) {
		windSpd = w;
		calcWindChillIndex();
	}
	
	//getters
	public double getTemp() {
		return temp;
	}
	
	public double getWindSpd() {
		return windSpd;
	}
	
	public double getWindChillIndex() {
		return windChillIndex;
	}
	
	
	//calculate the wind chill index
	public void calcWindChillIndex() {
		windChillIndex = (35.74 + (0.6215 * temp) - (35.75 * (Math.pow(windSpd, 0.16))) + (.4275 * temp * (Math.pow(windSpd, 0.16))));
		
	}
	
	

}
