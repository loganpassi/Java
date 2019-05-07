/*
 * LoganPassi
 * CIS2571
 * EngineTroubleshoot.java
 * 02/05/2019
 */

import javax.swing.JOptionPane;

public class EngineTroubleshoot {

	public static void main(String[] args) {
		
		String inpStr = "";
		char status = '\u0000', inletVel = '\u0000', tstPressure = '\u0000';
		double meter = 0.0;
		
		//if status is null keep looping
		while (status == '\u0000') {
			inpStr = JOptionPane.showInputDialog("Please enter the check status light color:\n'G' Green\n'A' Amber\n'R' Red");
			inpStr = inpStr.toUpperCase(); //convert the input to upper case so it is easier to check
			status = chckLights(inpStr, status);
			if (status == 'G' || status == 'A') //if the light is green or amber exit the program
				System.exit(0);
		}
		
		inpStr = JOptionPane.showInputDialog("Please enter in what meter #3 reads as a number:");
		meter = Double.parseDouble(inpStr); //parse the string 'inpStr' into the char 'meter'
	
		if (meter < 50.0) {
			while (tstPressure == '\u0000') { //if status is null keep looping
				inpStr = JOptionPane.showInputDialog("Please enter in pressure of the main line:\n'N' Normal\n'H' High\n'L' Low");
				inpStr = inpStr.toUpperCase(); //convert the input to upper case so it is easier to check
				tstPressure = tstPresFunc(inpStr,tstPressure);
			}
			
			System.exit(0);
		}
			
		else
		{
			while (inletVel == '\u0000') { //if status is null keep looping
				inpStr = JOptionPane.showInputDialog("Please enter in the velocity at inlet 2-B:\n'N' Normal\n'H' High\n'L' Low");
				inpStr = inpStr.toUpperCase(); //convert the input to upper case so it is easier to check
				inletVel = measureVelInlet(inpStr, inletVel);
			}
			
			System.exit(0);
		}
		
	}
	
	//function to determine what dialog box to display after measuring the velocity at inlet 2-B
	public static char measureVelInlet(String inp, char i) {
		
		i = inp.charAt(0); //converts the value of position 0 to a char and assigns it to the variable 'i'
		
		switch (i) {
		
		case 'N':
			JOptionPane.showMessageDialog(null, "Refer to inlet service manual", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'N';
		
		case 'H':
			JOptionPane.showMessageDialog(null, "Refer unit for factory service", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'H';
			
		case 'L':
			JOptionPane.showMessageDialog(null, "Refer unit for factory service", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'L';
			
		default:
			notOption();
			return '\u0000'; //returns null if there was no proper input
		
		}
	}
	
	//function to determine what dialog box to display after checking the main line pressure
	public static char tstPresFunc(String inp, char t) {
		
		t = inp.charAt(0); //converts the value of position 0 to a char and assigns it to the variable 't'
		
		switch (t) {
		
		case 'N':
			JOptionPane.showMessageDialog(null, "Refer to motor service manual", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'N';
			
		case 'H':
			JOptionPane.showMessageDialog(null, "Refer to main line manual", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'H';
			
		case 'L':
			JOptionPane.showMessageDialog(null, "Refer to main line manual", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'L';
			
		default:
			notOption();
			return '\u0000'; //returns null if there was no proper input
		}
	}
	
	
	//function to determine what dialog box to display after checking the status lights
	public static char chckLights(String inp, char s) {
		
		s = inp.charAt(0); //converts the value of position 0 to a char and assigns it to the variable 's'
		
		switch(s) {
		
		case 'G':
			JOptionPane.showMessageDialog(null, "Do Restart Procedure", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'G';
		
		case 'A':
			JOptionPane.showMessageDialog(null, "Check fuel line service routine", "Warning", JOptionPane.WARNING_MESSAGE);
			return 'A';
			
		case 'R':
			return 'R';
			
		default:
			notOption();
			return '\u0000'; //returns null if there was no proper input
		}

	}
	
	//function to display error text when an incorrect value is inputted
	public static void notOption() {
		JOptionPane.showMessageDialog(null, "You did not enter in a valid option!");
	}

}

