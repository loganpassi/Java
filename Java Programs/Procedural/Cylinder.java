/*
 *Logan Passi
 *CIS 2571
 *1/22/2019
 *Cylinder.java
*/
//This program will ask user to enter the radius and length of a cylinder. 
//The program will calc and display the area and the volume
package project1;
import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("hello world");
		
		//Get input for the radius
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		
		//Get input for the length
		System.out.print("Enter the length: ");
		double length = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		

	}

}


/*
hello world
Enter the radius: 25
Enter the length: 24
The area is 1963.4937499999999
The volume is 47123.85
*/