/*
 * Logan Passi
 * CIS 2571
 * 01/29/2019
 * Lab1.java
 */

import java.util.Scanner;
import java.text.*;

public class Lab1 {

	public static void main(String[] args) {
				
		double temp, windSpd;
		Scanner kb = new Scanner(System.in);
		
		//Get input for the temperature
		System.out.print("Enter in the temperature in Fahrenheit between -58F and 41F: ");
		temp = kb.nextDouble();
		
		//Make sure the temp is within the proper range
		while (temp < -51 || temp > 41) {
			System.out.println("The temperature needs to be between -51F and 41F!");
			System.out.print("Please enter in a temperature: ");
			temp = kb.nextDouble();
		}
		
		//Get input for wind speed
		System.out.print("Enter a wind speed that is greater than or equal to 2 in mph: ");
		windSpd = kb.nextDouble();
		
		//Make sure the wind speed is within the proper range
		while (windSpd < 2) {
			System.out.println("The wind speed needs to be greater than or equal to 2mph!");
			System.out.print("Please enter in a wind speed: ");
			windSpd = kb.nextDouble();
		}
		
		//Call funtion to calc and display the wind chill index
		calcAndDisplay(temp, windSpd);
		
		kb.close();

	}
	
	//Funciont to calc and display the wind chill index
	public static void calcAndDisplay(double temp, double windSpd) {
		DecimalFormat fiveDeci = new DecimalFormat("0.00000");

		double v = Math.pow(windSpd, 0.16);
		double ttlTemp = 35.74 + (0.6215 * temp) - (35.75 * v) + (0.4275 * temp * v);
		System.out.println("The wind chill index is: " + fiveDeci.format(ttlTemp));
	}

}

/*
 * Enter in the temperature in Fahrenheit between -58F and 41F: 5.3
 *Enter a wind speed that is greater than or equal to 2 in mph: 6
 *The wind chill index is: -5.56707
 */
