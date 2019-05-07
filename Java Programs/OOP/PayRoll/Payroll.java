/*
 * Logan Passi
 * CIS2571
 * 03/19/2019
 * Payroll.java
 * 
 * Code that creates a the class for a Payroll object
 */




import java.text.*;
import javax.swing.JOptionPane;


public class Payroll {
	
	public DecimalFormat twoDeci = new DecimalFormat("0.00");
	
	//private data members
	private String fName;
	private double payRate;
	private double hoursWorked;
	private double ttlPay;
	
	//default constructor
	public Payroll() {
		fName = "";
		payRate = 0.0;
		hoursWorked = 0.0;
		computePay();
	}
	
	//parameterized constructor
	public Payroll(String n, double r, double h) {
		fName = n;
		payRate = r;
		hoursWorked = h;
		computePay();
	}
	
	public Payroll(String n) {
		fName = n;
		payRate = 0.0;
		hoursWorked = 0.0;
		computePay();
	}
	
	//setters
	public void setFName(String n) {
		fName = n;
	}
	
	public void setPayRate(double r) {
		payRate = r;
	}
	
	public void hoursWorked(double h) {
		hoursWorked = h;
	}

	
	//getters
	public String getFName() {
		return fName;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public double getTtlPay() {
		return ttlPay;
	}
	
	//calculate
	public void computePay() {
		ttlPay = (payRate * ttlPay);
	}
	
	
	//print functions
	public String toString() {
		 return  ("\nName: " + fName
				+ "\nPay Rate: " + twoDeci.format(payRate) 
				+ "\nHours Worked: " + twoDeci.format(hoursWorked)
				+ "\nTotal Pay: " + twoDeci.format(ttlPay));
	}
	
	public void print() {
		JOptionPane.showMessageDialog(null, ("\nName: " + fName
				+ "\nPay Rate: " + twoDeci.format(payRate)
				+ "\nHours Worked: " + twoDeci.format(hoursWorked)
				+ "\nTotal Pay: " + twoDeci.format(ttlPay)));
	}
	
	
	
}
