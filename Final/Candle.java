/*
 * Logan Passi
 * CIS2571
 * 05/07/19
 * Candle.java
 * 
 * Candle Class, Final Exam
 */
package temp;

import java.text.*;

public class Candle {
	
	DecimalFormat twoDeci = new DecimalFormat("0.00");
	
	//Protected Data Members
	protected String color;
	protected int height;
	protected double price;
	
	//Default Constructor
	public Candle() {
		color = "";
		height = 0;
		calcPrice();
		
	}
	
	
	//Parameterized Constructor
	public Candle(String c, int h) {
		color = c;
		height = h;
		calcPrice();
	}
	
	//Function to Calculate the Price
	public void calcPrice() {
		price = 2 * height;
	}
	
	
	//Setters
	public void setColor(String c) {
		color = c;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	//Getters
	public String getColor() {
		return color;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "\n========Candle Object========\n"
				+ "\nColor: " + color
				+ "\nHeight: " + height + "in"
				+ "\nPrice: $" + twoDeci.format(price);
	}

}
