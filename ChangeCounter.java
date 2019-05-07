
/*
 * Logan Passi
 * CIS2571
 * 04/30/19
 * ChangeCounter.java
 */

package project1;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;

public class ChangeCounter implements ActionListener{
	
	DecimalFormat twoDeci = new DecimalFormat("0.00");
	
	JTextField qText, dText, nText, pText;
	JTextField qTextVal, dTextVal, nTextVal, pTextVal, ttlTextVal;
	
	JLabel prompt, quarterLabel, dimeLabel, nickelLabel, pennyLabel, quarterVal, dimeVal, nickelVal, pennyVal, ttlChangeVal, ttlVal;
	
	JButton computeBtn;
	
	JFrame frame = new JFrame();
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();

	ChangeCounter() {
		
		frame.setLayout(new GridBagLayout());
		
		frame.setTitle("Change Counter");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 350);
		frame.setVisible(true);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
		
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout());
		panel3.setLayout(new FlowLayout());
		panel4.setLayout(new FlowLayout());
		panel5.setLayout(new FlowLayout());
		panel6.setLayout(new FlowLayout());
		
		frame.setLayout(new GridLayout(6, 4, 1, 6));
		
		prompt = new JLabel("Enter the number of each coin type and hit, Compute:");
		//frame.add (prompt);
		panel1.add(prompt);
		
		computeBtn = new JButton("Compute");
		//frame.add (computeBtn);
		
		qText = new JTextField(5);
		dText = new JTextField(5);
		nText = new JTextField(5);
		pText = new JTextField(5);
		
		qTextVal = new JTextField(5);
		dTextVal = new JTextField(5);
		nTextVal = new JTextField(5);
		pTextVal = new JTextField(5);
		ttlTextVal = new JTextField(5);
		
		qTextVal.setEditable(false);
		dTextVal.setEditable(false);
		nTextVal.setEditable(false);
		pTextVal.setEditable(false);
		ttlTextVal.setEditable(false);
		
		quarterLabel = new JLabel("Quarters:");
		dimeLabel = new JLabel("Dimes:");
		nickelLabel = new JLabel("Nickels:");
		pennyLabel = new JLabel("Pennies:");
		quarterVal = new JLabel("Quarter value: $");

		dimeVal = new JLabel("Dime value: $");
		nickelVal = new JLabel("Nickel value: $");
		pennyVal = new JLabel("Penny value: $");
		ttlVal = new JLabel("Total Change Value: $");
		
		panel2.add(quarterLabel);
		panel2.add(qText);
		panel2.add(quarterVal);
		panel2.add(qTextVal);
		
		panel3.add(dimeLabel);
		panel3.add(dText);
		panel3.add(dimeVal);
		panel3.add(dTextVal);
		
		panel4.add(nickelLabel);
		panel4.add(nText);
		panel4.add(nickelVal);
		panel4.add(nTextVal);
		
		panel5.add(pennyLabel);
		panel5.add(pText);
		panel5.add(pennyVal);
		panel5.add(pTextVal);
		
		panel6.add(computeBtn);
		panel6.add(ttlVal);
		panel6.add(ttlTextVal);
		
		
		computeBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int numQuarters;
		int numDimes;
		int numNickels;
		int numPennies;
		
		double valQuarters = 0;
		double valDimes = 0;
		double valNickels = 0;
		double valPennies = 0;
		double ttl = 0;
		
		try {
			numQuarters = Integer.parseInt(qText.getText());
		}
		
		catch(NumberFormatException ex) {
			numQuarters = 0;
		}
		
		try {
			numDimes = Integer.parseInt(dText.getText());
		}
		
		catch (NumberFormatException ex) {
			numDimes = 0;
		}
		
		try {
			numNickels = Integer.parseInt(nText.getText());
		}
		
		catch (NumberFormatException ex) {
			numNickels = 0;
		}
		
		try {
			numPennies = Integer.parseInt(pText.getText());
		}
		
		catch (NumberFormatException ex) {
			numPennies = 0;
		}
		
		valQuarters = numQuarters * .25;
		valDimes = numDimes * .1;
		valNickels = numNickels * .05;
		valPennies = numPennies * .01;
		
		ttl += valQuarters;
		qTextVal.setText(twoDeci.format(valQuarters));
		
		ttl += valDimes;
		dTextVal.setText(twoDeci.format(valDimes));
		
		ttl += valNickels;
		nTextVal.setText(twoDeci.format(valNickels));
		
		ttl += valPennies;
		pTextVal.setText(twoDeci.format(valPennies));
		
		ttlTextVal.setText(twoDeci.format(ttl));
	}
	public static void main(String[] args) {
		ChangeCounter cc = new ChangeCounter();
	}

}

