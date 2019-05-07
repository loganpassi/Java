/*
 * Logan Passi
 * CIS2571
 * 02/19/2019
 * payRoll.java
 * 
 * Simple program to calculate and display the payroll
 *  for a however many employees are entered
 */

//imported for the JOptionPane
import javax.swing.JOptionPane;

//imported for the DecimalFormat
import java.text.*;

public class payRoll {
	
	public static void main(String[] args) {
		int empCount, empHours, counter = 0;
		String name, social, hours, rates;
        double empRate;
        
        //Get input from the user to determine how many employees' gross pay are going to be
        //calculated and displayed
        String employeeCount = JOptionPane.showInputDialog( "Enter the number of employees: ");
		empCount = Integer.parseInt(employeeCount);
		
		//do while loop to keep looping until the gross pay for each employee has
		//been calculated and displayed
		
		do
		{
			name = JOptionPane.showInputDialog("Enter employee's full name:");
            social = JOptionPane.showInputDialog("Enter employee's SSN:");
            hours = JOptionPane.showInputDialog("Enter the number of hours worked:");
            empHours = Integer.parseInt(hours);
			
            rates = JOptionPane.showInputDialog("Enter the employee's rate of pay:");
			empRate = Double.parseDouble(rates);
			
			counter ++;
			displayPay(name, empHours, computePay(empHours, empRate));
			
		} while(counter < empCount);
	}
	
	//function to compute the pay for each employee and return it
    public static double computePay(int hrs, double rate) {
    	double pay, normal;
    	
        if(hrs > 40){
        	hrs -= 40;
        	normal = rate * 40;
        	pay = ((rate * 1.5) * hrs) + normal;
		}
        else
        	pay = hrs * rate;
		
		return pay;
	}
    
    //function to display the pay for each employee
    public static void displayPay(String fullname, int hoursWorked, double grossPay){
    
    //added to format the grossPay output
    DecimalFormat twoDeci = new DecimalFormat("0.00");
    
    String allString = "";
    allString = "Employee Name: " + fullname + "\n";
    allString = allString + "Hours worked: " + hoursWorked + "\n";
    allString = allString + "Gross Pay: $" + twoDeci.format(grossPay) + "\n";
    JOptionPane.showMessageDialog(null, allString , fullname + "'s" + " Gross Pay",
    JOptionPane.INFORMATION_MESSAGE);
    }
}
             
