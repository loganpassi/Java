/*Logan Passi
 * CIS2571
 * 02/21/19
 * grossPay.java
 * 
 * Program to determine the gross pay for each of several employees
 */

import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.JTextArea;

public class grossPay {

	public static void main(String[] args) {
		String tempStr = "", fullName = "";
		double rate = 0.0, grossPay = 0.0, hoursWorked = 0.0;
		int SSN = 0, numEmp = 0;
		
		//Get input too determine how many employees will be taken into consideration
		tempStr = JOptionPane.showInputDialog("How many employees are being inputted?");
		numEmp = Integer.parseInt(tempStr);
		
		//if less than two employees are entered then loop and make sure at least two or more employees are being entered
		while (numEmp < 2) {
			JOptionPane.showMessageDialog(null, "You must enter in at least two or more employees!");
			tempStr = JOptionPane.showInputDialog("How many employees are being inputted?");
			numEmp = Integer.parseInt(tempStr);
		}

		
		//for loop that keeps looping until all the employees gross payments have been calculated
		for (int i = 0; i < numEmp; ++i) {
			fullName = JOptionPane.showInputDialog("Please enter in your full name\nExample: \"Jon Doe\"");
			tempStr = JOptionPane.showInputDialog("Please enter in your entire Social Security Number");
			
			//if the entered ssn is too big then it is not valid
			while (tempStr.length() > 11) {
				JOptionPane.showMessageDialog(null, "That is not a valid entry!");
				tempStr = JOptionPane.showInputDialog("Please enter in your entire Social Security Number");
			}
			
			//try to parse the ssn string to an int but if not, then take out unnecessary characters
			try {
				SSN = Integer.parseInt(tempStr);
			}
			
			//if the 4th character in the string is either a "-" or " " then remove all of that character and then parse to an int
			catch (Exception e) {
				switch (tempStr.charAt(3)) {
				
				
					case ' ':
						tempStr = tempStr.replace(" ", "");
						break;
				
					case '-':
						tempStr = tempStr.replace("-", "");
						break;
				
					default:
						JOptionPane.showMessageDialog(null, "That is not a valid entry!");
						System.exit(0);
				}
					
			}
			
			tempStr = JOptionPane.showInputDialog("Please enter in the hours you worked");
			hoursWorked = Double.parseDouble(tempStr);
			
			tempStr = JOptionPane.showInputDialog("Please enter in your hourly wage");
			rate = Double.parseDouble(tempStr);		
			
			//call computePay funct to calc the gross pay
			grossPay = computePay((int)hoursWorked, rate);
			
			//call the displayPay funtion to display the calculations and results
			displayPay(fullName, hoursWorked, grossPay);
			
		}
	}
		
		
	//function to calc the grossPay
	public static double computePay(int hrs, double r) {
		 
		//checking to see if it is necessary to calculate overtime
		if (hrs > 40) {
			hrs -= 40;
			return (hrs * (r * 1.5)) + (40 * r);
		}
		else
			return hrs * r;
	}
	
	
	//function to display the results
	public static void displayPay(String fN, double hW, double gP) {
		DecimalFormat twoDeci = new DecimalFormat("0.00");
		JTextArea output = new JTextArea(3, 25);
		
		output.append("Employee\tHours Worked\tGross Payments\n");
		output.append(fN + "\t" + twoDeci.format(hW) + "\t" + twoDeci.format(gP));
		
		JOptionPane.showMessageDialog(null, output, "Calculation", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}