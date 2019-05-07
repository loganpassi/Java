/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * CollegeCourse.java
 * 
 * Inheritance HW 2
 */
package proj;

public class CollegeCourse {
	
	//private data members
	protected String department;
	protected int courseNum;
	protected int credits;
	protected double fee;
	
	//default constructor
	CollegeCourse() {
		
		department = "";
		courseNum = 0;
		credits = 0;
		fee = 0d;
	}
	
	//parameterized constructor
	CollegeCourse(String d, int cNum, int c) {
		department = d;
		courseNum = cNum;
		credits = c;
		calcFee();
	}
	
	//funtion to calculate the fee of the course
	public void calcFee() {
		fee = 120d * credits;
	}
	
	//setters
	public void setDep(String d) {
		department = d;
	}
	
	public void setCourseNum(int cNum) {
		courseNum = cNum;
	}
	
	public void setCredits(int c) {
		credits = c;
	}
	
	//getters
	public String getDep() {
		return department;
	}
	
	public int getCourseNum() {
		return courseNum;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public double getFee() {
		return fee;
	}
	
	//function to display all data
	public void display() {
		System.out.println(
				"\nDepartment: " + department
				+ "\nCourse Number: " + courseNum
				+ "\nCredits: " + credits
				+ "\nFee: " + fee);
				
	}

}
