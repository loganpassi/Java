/*
 * Logan Passi
 * CIS2571
 * 04/23/19
 * Program3.java
 * 
 * This program demonstrates Error Exceptions
 */
package proj1;

public class Program3 {

	public static void main(String[] args) {
		int num1, num2, result = 0;
		
		if(args.length != 3) {
			System.out.println("Please enter operand1, operator and operator2: ");
			System.exit(1);
		}
		
		try {
			num1 = Integer.parseInt(args[0]);
		}
		
		catch (NumberFormatException ex) {
			System.out.println("Wrong Input:" + args[0]);
			return;
		}
		
		try {
			num2 = Integer.parseInt(args[2]);
		}
		
		catch (Exception ex) {
			System.out.println("Wrong input:" + args[2]);
			return;
		}
		
		switch (args[1].charAt(0)) {
			
		case '+' : result = num1 + num2;
		break;
		
		case '-' : result = num1 - num2;
		break;
		
		case 'x' : result = num1 * num2;
		break;
		
		case '/' : result = num1 / num2;
		break;
		
		case '%' : result = num1 % num2;
		break;
		}
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}

}
