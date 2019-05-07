/*
 * Logan Passi
 * CIS2571
 * 04/30/19
 * GUI1.java
 * 
 * This program demonstrates java GUI
 */
package proj1;

import javax.swing.JOptionPane;

public class GUI1 {

	public static void main(String[] args) {

		String firstNumber, secondNumber;
		
		int number1, number2, sum;
		
		firstNumber = JOptionPane.showInputDialog("Enter first number: ");
		number1 = Integer.parseInt(firstNumber);
		
		secondNumber = JOptionPane.showInputDialog("Enter second number: ");
		number2 = Integer.parseInt(secondNumber);
		
		sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum + ".", "Result", JOptionPane.PLAIN_MESSAGE);

	}

}
