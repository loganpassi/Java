/*
 * Logan Passi
 * CIS2571
 * 02/19/2019
 * BookstoreCredit.java
 * 
 * Short program to calculate and display how much credit a student
 * will receive based on their grade point average (GPA)
 */

//import JOptionPane for the input and output dialog boxes
import javax.swing.JOptionPane;

//import text.* for the Decimal Format
import java.text.*;

public class BookstoreCredit {

	public static void main(String[] args) {
		
		String fName, tempStr;
		double GPA;
		
		//get the user's name and GPA
		fName = JOptionPane.showInputDialog("Please enter in you name: ");
		tempStr = JOptionPane.showInputDialog("Please enter in your GPA: ");
		
		//parse the tempStr into GPA
		GPA = Double.parseDouble(tempStr);
		
		//call the calcAndDisplay function
		calcAndDisplay(fName, GPA);
	}
	
	//function to calculate and display the student's name,
	//GPA and credit
	public static void calcAndDisplay (String f, double g) {
		
		//make the formatting for the credit output
		DecimalFormat twoDeci = new DecimalFormat("0.00");
		
		//calculate the credit based on the GPA
		double credit = g * 10;
		
		//string to concatenate the name, gpa and credit for the output
		String output = "Name: " + f + "\n"
						+ "GPA: " + g + "\n"
						+ "Credit: " + twoDeci.format(credit);
		
		//output the name, gpa and credit with a string
		JOptionPane.showMessageDialog(null, output);
	}
}


