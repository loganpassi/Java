/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * NonFiction.java
 * 
 * Inheritance and Abstract Lab 1
 */
package proj;

public class NonFiction extends Book {
	
	//default constructor
	public NonFiction() {
		super();
		setPrice();
	}
	
	//parameterized constructor
	public NonFiction(String t) {
		super(t);
		setPrice();
	}
	
	//function to set the price of the book
	public void setPrice() {
		price = 37.99;
	}
	
	//function that displays the title and price of the book
	public void display() {
		System.out.println(
				"\nTitle: " + title
				+ "\nPrice: " + price);
	}

}
