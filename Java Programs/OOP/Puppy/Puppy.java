/*
 * Logan Passi
 * CIS2571
 * 03/05/2019
 * Puppy.java
 * 
 * Simple class to create a Puppy object
 */

package proj1;

public class Puppy {
	
	//private data members
	
	private int age;
	
	private String name;
	
	//default constructor
	
	public Puppy() {};
	
	//parameterized constructor
	
	public Puppy(String n, int a) {
		name = n;
		age = a;
	}
	
	//copy constructor
	
	public Puppy(Puppy p) {
		name = p.getName();
		age = p.getAge();
	}
	
	//setters
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	//getters
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}
