/*
 * Logan Passi
 * CIS2571
 * 04/30/19
 * SimpleDemo.java
 * 
 * This program demonstrates event driven GUI Interface
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleDemo extends JFrame {
	
	public SimpleDemo() {
		JButton jbtOK = new JButton("OK");
		setLayout(new FlowLayout());
		add (jbtOK);
		
	ActionListener listener = new OKListener();
	jbtOK.addActionListener(listener);
	
	
	JButton jbtOK2 = new JButton("OK2");
	setLayout(new FlowLayout());
	add(jbtOK2);
	jbtOK2.addActionListener(listener);
	}

	
	public static void main(String[] args) {
		JFrame frame = new SimpleDemo();
		frame.setTitle("SimpleEventDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

}

class OKListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("You just clicked the \"OK\" button!");
	}
}
