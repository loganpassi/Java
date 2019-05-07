/*
 * Logan Passi
 * CIS2571
 * 03/05/2019
 * CircleTest.java
 * 
 * Simple program that creates circle objects
 */

package proj1;

import java.text.*;

public class CircleTest {

	public static void main(String[] args) {
		
		DecimalFormat twoDeci = new DecimalFormat("0.00"); //DecimalFormat object to format the output to two decimal places
		
		Circle circArr[] = new Circle[3]; //create an array that holds circle objects
		
		circArr[0] = new Circle(); //call default constructor for the first circle in the array
		circArr[0].setRadius(2); //set the radius to 2
		
		circArr[1] = new Circle(); //call the default constructor for the second circle in the array
		circArr[1].setRadius(34); //set the radius to 34
		
		circArr[2] = new Circle(); //call the default constructor for the third circle in the array
		
		for (int i = 0; i < circArr.length; ++i) { //loop through the array to output the data for each circle
			System.out.println("\n\nCircle " + (i + 1)
					+ "\nRadius: " + circArr[i].getRadius()
					+ "\nDiameter: " + circArr[i].getDiameter()
					+ "\nArea: " + twoDeci.format(circArr[i].getArea()));
		}
		

	}

}

/*


Circle 1
Radius: 2.0
Diameter: 4.0
Area: 12.57


Circle 2
Radius: 34.0
Diameter: 68.0
Area: 3631.68


Circle 3
Radius: 1.0
Diameter: 2.0
Area: 3.14

*/
