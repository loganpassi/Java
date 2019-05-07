/*
 * Logan Passi
 * CIS2571
 * 03/19/2019
 * Box.java
 * 
 * Code to write a class called Box
 */
package proj1;

public class Box {
	
	//private data members
	private double length;
	private double width;
	private double height;
	
	//default constructor
	public Box() {
		length = 1.0;
		width = 1.0;
		height = 1.0;
	}
	
	//parameterized constructor
	public Box(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	
	//setters
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	//getters
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	//calculations
	public double calcArea() {
		return (length * width * 6);
	}
	
	public double calcVolume() {
		return (length * width * height);
	}
	
	
	//print values
	public void printAll() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("\nSurface Area: " + calcArea());
		System.out.println("Volume: " + calcVolume());
	}
	
	public String toString() {
		return ("\nLength: " + length
				+ "\nWidth: " + width
				+ "\nHeight: " + height);
	}

}
