/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * Book.java
 * 
 * Inheritance and Abstract Lab 1
 */
package proj;

public abstract class Book {
	
	//private data members
	protected String title;
	protected double price;
	
	//default constructor
	public Book() {
		title = "";
		price = 0d;
	}
	
	//parameterized constructor
	public Book(String t) {
		title = t;
		price = 0d;
	}
	
	//getters
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	//abstract setter
	public abstract void setPrice();
	
	//abstract function that will display all the data of the object
	public abstract void display();

}
