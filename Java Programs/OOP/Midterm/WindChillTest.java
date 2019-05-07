/*
 * Logan Passi
 * CIS2571
 * 03/12/19
 * WindChillTest.java
 * 
 * Program to utilize the WindChill.java file and create a 
 * WindChill object that calculates the wind chill based off the
 * entered temperature and wind speed.
 */
package proj1;

import java.util.Scanner;
import java.text.*;

public class WindChillTest {

	public static void main(String[] args) {
		
		double temp = 0.0;
		double windSpd = 0.0;
		
		WindChill windChill = new WindChill(); //create a WindChill object
		
		Scanner input = new Scanner(System.in); //create a Scanner object to get input from the user
		DecimalFormat fiveDeci = new DecimalFormat("0.00000"); //create a DecimalFormat object to format the output
		
		
		
		System.out.print("Enter the temperature in Fahrenheit between -58F "
				+ "and 41F: ");
		
		temp = input.nextDouble();
		
		while (temp < -58.0 || temp > 41.0) { //check to make sure the input is valid and if not, ask for valid input
			
			System.out.print("\nYou must enter in a temperature in Fahrenheit between -58F " 
				+ "and 41F: ");
			
			temp = input.nextDouble();
			
		}
		
		windChill.setTemp(temp); //set the temp of the windChill object
		
		
		
		System.out.print("\nEnter the wind speed (>=2) in miles per hour: ");
		
		windSpd = input.nextDouble();
		
		while (windSpd < 2) { //check to make sure the input is valid and if not, ask for valid input
			
			System.out.print("\nYou must enter in a wind speed (>=2) in miles per hour: ");
			
			windSpd = input.nextDouble();
		}
		
		windChill.setWindSpd(windSpd); //set the wind speed of the windChill object
		
		
		System.out.println("\nThe wind chill index is: " + fiveDeci.format(windChill.getWindChillIndex()));
		
		
		input.close(); //close the scanner object
		

	}

}


/*
Enter the temperature in Fahrenheit between -58F and 41F: 5.3

Enter the wind speed (>=2) in miles per hour: 6

The wind chill index is: -5.56707


Enter the temperature in Fahrenheit between -58F and 41F: -60

You must enter in a temperature in Fahrenheit between -58F and 41F: -69

You must enter in a temperature in Fahrenheit between -58F and 41F: -23

Enter the wind speed (>=2) in miles per hour: 1.2

You must enter in a wind speed (>=2) in miles per hour: 1.56

You must enter in a wind speed (>=2) in miles per hour: 2.56

The wind chill index is: -31.53506
*/

