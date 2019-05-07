/*
 * Logan Passi
 * CIS2571
 * 03/05/2019
 * Circle.java
 * 
 * Simple program to create a circle class
 */

package proj1;

import java.lang.Math.*;

public class Circle {

	private double radius;
	private double diameter;
	private double area;
	
	
	//default constructor
	public Circle() {
		radius = 1;
		diameter = calcDiameter(radius);
		area = calcArea(radius);
		
	}
	
	//parameterized constructor
	public Circle(double r) {
		radius = 1;
		diameter = calcDiameter(radius);
		area = calcArea(radius);
	}
	
	//calculations
	public double calcDiameter(double r) {
		return (2.0 * r);
	}
	
	public double calcArea(double r) {
		return (Math.PI * (Math.pow(r, 2)));
	}
	
	
	//setters
	
	public void setRadius(double r) {
		radius = r;
		diameter = calcDiameter(radius);
		area = calcArea(radius);
	}
	
	//getters
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getDiameter() {
		return diameter;
	}	
}
