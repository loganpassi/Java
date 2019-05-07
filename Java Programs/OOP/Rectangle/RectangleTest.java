/*
 * Logan Passi
 * CIS2571
 * 03/05/2019
 * RectangleTest.java
 * 
 * Simple program to create Rectangle objects
 */
package proj1;

import java.text.*;

public class RectangleTest {

	public static void main(String[] args) {
		
		DecimalFormat twoDeci = new DecimalFormat("0.00");
		
		Rectangle rectArr[] = new Rectangle [2]; //create an array to hold rectangle objects
		
		rectArr[0] = new Rectangle(); //create 
		
		rectArr[0].setWidth(4); //use the public setters to set the width and height
		rectArr[0].setHeight(40);
		
		rectArr[1] = new Rectangle(3.5, 35.9); //create a rectangle object with the parameterized constructor
		
		for (int i = 0; i < rectArr.length; ++i) { //loop through the array of rectangle objects to print out their data
			
			System.out.println("\n\nRectangle " + (i + 1) + "\nWidth: " + rectArr[i].getWidth() + "\nHeight: " + rectArr[i].getHeight()
					+ "\nArea: " + twoDeci.format(rectArr[i].getArea()) + "\nPerimeter: " + rectArr[i].getPerimeter());
		}
		
		

	}

}



/*




Rectangle 1
Width: 4.0
Height: 40.0
Area :160.00
Perimeter :88.0


Rectangle 2
Width: 3.5
Height: 35.9
Area :125.65
Perimeter :78.8


*/