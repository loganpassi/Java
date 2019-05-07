/*
 * Logan Passi
 * CIS2571
 * 04/30/19
 * GUICalculator.java
 * 
 * GUI Lab 1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUICalculator extends JFrame{
	
	//default constructor
	public GUICalculator() {
		
		TextField columns = new TextField(6);
		
		JTextArea num1Text = new JTextArea("Number 1");
		num1Text.setEditable(false);
		
		JTextArea num2Text = new JTextArea("Number 2");
		num2Text.setEditable(false);
		
		JTextArea resultText = new JTextArea("Result");
		resultText.setEditable(false);

		
		String numStr1, numStr2;
		
		int num1 = 0, num2 = 0, result = 0;
		
		JButton add = new JButton("Add");
		
		JButton sub = new JButton("Subtract");
		
		JButton mul = new JButton("Multiply");
		
		JButton div = new JButton("Divide");
		
		
		ActionListener addListener = new addListener(num1, num2);
		
		JTextField firstNum = new JTextField("\t");
		JTextField secondNum = new JTextField("\t");
		JTextField resultWin = new JTextField("\t");
		resultWin.setEditable(false);
		
		setLayout(new FlowLayout());
		add(num1Text);
		add(firstNum);
		add(num2Text);
		add(secondNum);
		add(resultText);
		add(resultWin);
		add(add);
		add(sub);
		add(mul);
		add(div);
		
		
		
	}

	public static void main(String[] args) {
		JFrame frame = new GUICalculator();
		frame.setTitle("My Calculator");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(525, 100);
		frame.setVisible(true);

	}

}

class addListener implements ActionListener{
	
	//private data members
	private int number1;
	private int number2;
	
	//default constructor
	addListener() {
		number1 = 0;
		number2 = 0;
	}
	
	//parameterized constructor
	addListener(int num1, int num2) {
		number1 = num1;
		number2 = num2;
	}
	public void actionPerformed(ActionEvent e) {
		sum();
	}
	
	public int sum() {
		return number1 + number2;
	}
}

class subListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
	}
}
