/*
 * Logan Passi
 * CIS2571
 * 03/05/2019
 * PuppyTest.java
 * 
 * Simple program utilizing objects
 */
package proj1;

public class PuppyTest {

	public static void main(String[] args) {
		
		Puppy myPuppy = new Puppy(); //create new puppy object with default constructor
		myPuppy.setName("Tommy"); //set the name to "Tommy"
		myPuppy.setAge(2); //set the age to 2
		
		Puppy friendPuppy = new Puppy("Spotty", 3); //create new puppy object with the parameterized constructor
		
		Puppy sisterPuppy = new Puppy(myPuppy); //create new puppy object with the copy constructor

		
		
		System.out.println("The age of " + myPuppy.getName() + " is " + myPuppy.getAge());
		System.out.println("The age of " + friendPuppy.getName() + " is " + friendPuppy.getAge());
		System.out.println("The age of " + sisterPuppy.getName() + " is " + sisterPuppy.getAge());
		

	}

}
