/*
 * Logan Passi
 * CIS2571
 * 03/19/2019
 * MyPoint.java
 * 
 * Code that creates the class for a MyPoint object
 */
package proj1;

public class MyPoint {
	
	//private data members
	private double x;
	private double y;
	
	
	//default constructor
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	//parameterized constructor
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//setters
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	//getters
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	//print
	public void print() {
		System.out.println("X: " + x + "\nY: " + y);
	}
	
	
	public String toString() {
		return ("\nX: " + x
				+"\nY: " + y);
	}
	
	
	//calculation
	public String distance(MyPoint p) {
		
		return ("Distance: " + Math.sqrt((Math.pow((p.getX() - x), 2) + (Math.pow((p.getY() - y), 2)))));
	}
	
	static String distance(MyPoint p1, MyPoint p2) {
		
		return ("Distance: " + Math.sqrt((Math.pow((p2.getX() - p1.getX()), 2) + (Math.pow((p2.getY() - p1.getY()), 2)))));
		
	}
	

}
