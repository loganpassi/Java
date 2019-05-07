/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * LabCourse.java
 * 
 * Inheritance HW 2
 */
package proj;

public class LabCourse extends CollegeCourse {
	
	
	//default constructor
	public LabCourse() {
		super();
		fee += 50d;
	}
	
	//parameterized constructor
	public LabCourse(String dep, int cNum, int cred) {
		super(dep, cNum, cred);
		fee += 50d;
	}
	
	//function to display information
	public void display() {
		System.out.println(
				"\nCourse Is a Lab Course"
				+ "\nDepartment: " + department
				+ "\nCourse Number: " + courseNum
				+ "\nCredits: " + credits
				+ "\nFee: " + fee);
	}
	
}
