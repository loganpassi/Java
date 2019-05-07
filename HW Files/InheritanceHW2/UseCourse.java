/*
 * Logan Passi
 * CIS2571
 * 04/16/19
 * UseCourse.java
 * 
 * Inheritance HW 2
 */
package proj;

import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		
		//create a scanner object to get input from the user
		Scanner input = new Scanner(System.in);
		
		String dep = "";
		int cNum = 0;
		int cred = 0;
		
		System.out.print("Please enter in the Department: ");
		dep = input.nextLine();
		
		System.out.print("Please enter in the Course Number: ");
		cNum = input.nextInt();
		
		System.out.print("Please enter in the Credit Hours: ");
		cred = input.nextInt();
		
		if (dep.contentEquals("BIO") || dep.contentEquals("CHM") || dep.contentEquals("CIS") || dep.contentEquals("PHY")) {
			LabCourse lCourse = new LabCourse(dep, cNum, cred);
			lCourse.display();
		}
		else {
			CollegeCourse cCourse = new CollegeCourse(dep, cNum, cred);
			cCourse.display();
		}
		
		
		input.close();
		

	}

}


/*
Please enter in the Department: BIO
Please enter in the Course Number: 542
Please enter in the Credit Hours: 3

Course Is a Lab Course
Department: BIO
Course Number: 542
Credits: 3
Fee: 410.0

/////////////////////////////////////////////

Please enter in the Department: CIT
Please enter in the Course Number: 450
Please enter in the Credit Hours: 4

Department: CIT
Course Number: 450
Credits: 4
Fee: 480.0
*/