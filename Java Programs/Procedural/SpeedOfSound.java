/*
 * Logan Passi
 * CIS2571
 * SpeedOfSound.java
 * 02/05/2019
 * 
 * Program to calc and display the time it takes for sound to travel through the given material and over the given distance.
 */

package p1;
import java.util.Scanner;
import java.text.*;
public class SpeedOfSound {

	public static void main(String[] args) {
		int velocity = 1;
		double distance = -1.0, time = 0.0;
		char material = ' ';
		String matStr;
		
		//make a scanner object to get input
		Scanner input = new Scanner(System.in);
		
		//checks to see if the input was valid, if not returns 1 and continues the loop
		while (velocity == 1) {
			System.out.println("Please choose what material the sound is traveling through:\n\tA: Air\n\tW: Water\n\tS: Steel");
			material = Character.toUpperCase(input.next().charAt(0));
			velocity = getVel(material);
		}
		
		//checks to see if the distance is greater than 0, if not it continues looping 
		while (distance <= 0) {
			System.out.println("Please enter in the distance in feet: ");
			distance = input.nextDouble();
			//calls function to calculate the time
			time = calcTime(velocity, distance);
		}

		//closes scanner object
		input.close();
		
		DecimalFormat fourDeci = new DecimalFormat("0.0000");
		
		//calls the function to get the string of the material
		matStr = getMat(material);
		System.out.println("The time it takes for a sound wave to travel "
				+ distance + " feet through " + matStr + " is " + fourDeci.format(time) + " second(s).");

	}
	
	//function to return the string of the material with the given char
	public static String getMat(char m) {
		
		String mat ="";
		
		switch (m) {
		
		case 'A':
			mat = "air";
			break;
		
		case 'W':
			mat = "water";
			break;

		case 'S':
			mat = "steel";
			break;
		}
		
		return mat;
	}
	
	//function to calculate the time
	public static double calcTime(int vel, double dis) {
		return dis/vel;
	}

	//function to get the velocity for the corresponding material that the sound waves are traveling through
	public static int getVel(char m) {
		
		//declare and assign values for the different velocities
		int airVel = 1100;
		int waterVel = 4900;
		int steelVel = 16400;
		
		switch(m) {
		
		case 'A':
			System.out.println("You have chosen Air!\n");
			return airVel;
			
		case 'W':
			System.out.println("You have chosen Water!\n");
			return waterVel;
		
		case 'S':
			System.out.println("You have chosen Steel!\n");
			return steelVel;
			
		default:
			System.out.println("You have not entered in a valid option!");
			return 1;
		}
	}
}


/*
 Please choose what material the sound is traveling through:
A: Air
W: Water
S: Steel
w
You have chosen Water!

Please enter in the distance in feet: 
5000
The time it takes for a sound wave to travel 5000.0 feet through water is 1.0204 second(s).

===================================================================================================

Please choose what material the sound is traveling through:
	A: Air
	W: Water
	S: Steel
s
You have chosen Steel!

Please enter in the distance in feet: 
14587
The time it takes for a sound wave to travel 14587.0 feet through steel is 0.8895 second(s).

===================================================================================================

Please choose what material the sound is traveling through:
	A: Air
	W: Water
	S: Steel
t
You have not entered in a valid option!
Please choose what material the sound is traveling through:
	A: Air
	W: Water
	S: Steel
a
You have chosen Air!

Please enter in the distance in feet: 
5478
The time it takes for a sound wave to travel 5478.0 feet through air is 4.9800 second(s).

===================================================================================================

Please choose what material the sound is traveling through:
	A: Air
	W: Water
	S: Steel
y
You have not entered in a valid option!
Please choose what material the sound is traveling through:
	A: Air
	W: Water
	S: Steel
t
You have not entered in a valid option!
Please choose what material the sound is traveling through:
	A: Air
	W: Water
	S: Steel
s
You have chosen Steel!

Please enter in the distance in feet: 
0
Please enter in the distance in feet: 
-3
Please enter in the distance in feet: 
25489
The time it takes for a sound wave to travel 25489.0 feet through steel is 1.5542 second(s).

*/