/*
 * Logan Passi
 * CIS2571
 * 03/05/2019
 * Rectangle.java
 * 
 * Simple class to create a rectangle object
 */
package proj1;

public class Rectangle {
	
	//private data members
	private double width;
	private double height;
	
	//default constructor
	public Rectangle() {
		width = 1.00;
		height = 1.00;
	}
	
	//parameterized constructor
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	//setters
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setHeight(double h) {
		height = h;
	}

	//getters
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}

}
