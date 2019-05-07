/*
 * Logan Passi
 * CIS2571
 * 02/12/19
 * loops.java
 * 
 * Simple program using a while loop and JOptionPane to get input from the user, calculate the sum of the user's
 * input and then display the output
 */
import javax.swing.JOptionPane;
public class loops {

	public static void main(String[] args) {
		String dataStr = JOptionPane.showInputDialog("Enter any integer value:\n(Enter zero to end input)");
		int data = Integer.parseInt(dataStr);
		int sum = 0;
		while (data != 0) {
			sum += data;
			dataStr = JOptionPane.showInputDialog("Enter any integer value:\n(Enter zero to end input)");
			data = Integer.parseInt(dataStr);
		}
		
		JOptionPane.showMessageDialog(null, "The sum of your numbers is " + sum + ".");

	}

}
