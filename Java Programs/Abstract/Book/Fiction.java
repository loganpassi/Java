/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * Fiction.java
 * 
 * Inheritance and Abstract Lab 1
 */
package proj;

public class Fiction extends Book{
	
	//default constructor
	public Fiction() {
		super();
		setPrice();
	}
	
	//parameterized constructor
	public Fiction(String t) {
		super(t);
		setPrice();
	}
	
	//function to set the price of the book
	public void setPrice() {
		price = 24.99;
	}
	
	//function that displays the title and price of the book
	public void display() {
		System.out.println(
				"\nTitle: " + title
				+ "\nPrice: " + price);
							
	}

}
