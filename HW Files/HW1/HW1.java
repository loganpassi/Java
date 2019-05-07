/*
 * Logan Passi
 * CIS 2571
 * 01/29/2019
 * HW1.java
 * 
 * Program to display results of a textbook.
 */

import javax.swing.JOptionPane;
import java.text.*;

public class HW1 {

	public static void main(String[] args) {
		
		DecimalFormat twoDeci = new DecimalFormat("0.00");
		
		String allString, subjectCode, bookCode, bookCost, volumes, classEnrollment, rR, used;
		int booksNeeded;
		float ttlCost, profit;
		
		subjectCode = JOptionPane.showInputDialog("Enter the Subject Code:", "Input");
		bookCode = JOptionPane.showInputDialog("Enter the Book code (for ISBN Number):", "Input");
		bookCost = JOptionPane.showInputDialog("Enter the book's single volume cost:", "Input");
		volumes = JOptionPane.showInputDialog("Enter the number of current volumes on hand:", "Input");
		classEnrollment = JOptionPane.showInputDialog("Enter the class enrollment", "Input");
		rR = JOptionPane.showInputDialog("Is the book Required or Recommended. Enter <Required or Recommened>", "Input");
		used = JOptionPane.showInputDialog("Has this book been used in the past? Enter <Yes or No>", "Input");
		
		booksNeeded = Integer.parseInt(classEnrollment) - Integer.parseInt(volumes);
		ttlCost = booksNeeded * Float.parseFloat(bookCost);
		profit = ttlCost * .2F;
		
		allString = "ISBN Number: " + bookCode + "\n"
				+ "Single Volume Cost: " + bookCost + "\n"
				+ "Number of Volumes on Hand: " + volumes + "\n"
				+ "Class Enrollment: " + classEnrollment + "\n"
				+ "Required/Recommened: " + rR + "\n"
				+ "Used in Past: " + used + "\n\n"
				+ "Books Needed: " + booksNeeded + "\n"
				+ "Total Cost of Books Ordered: $" + twoDeci.format(ttlCost) + "\n"
				+ "Profit: $" + twoDeci.format(profit);
		
		JOptionPane.showMessageDialog(null, allString, "Results", JOptionPane.INFORMATION_MESSAGE);

	}

}
