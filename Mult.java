//Logan Passi
//01/15/20
//Mult.java
//Short program that will multiply two entered numbers iteratively and recursively.

import java.util.Scanner; //Needed to create a scanner object

public class Mult {

	static final int M_MAX = 1000;
	static final int N_MAX = 1001;
	
	static Scanner input = new Scanner(System.in); //Creating a scanner object to get input from the user

	
	public static void main(String[] args) {
		int product = 0;
		
		System.out.println("Enter two natural numbers, 'm' and 'n', both less than\n" + M_MAX + " and " + N_MAX);
		int n, m;
		
		System.out.print("M: ");
		m = Integer.parseInt(input.nextLine()); //Get the value of 'M' from the user and assign it to 'M'
		
		System.out.print("N: ");
		n = Integer.parseInt(input.nextLine()); //Get the value of 'N' from the user and assign it to 'N'
		
		if (m <= 0 || n <= 0) {
			System.out.println("ERROR, end of program, numbers should be greater than 0");
			System.exit(0);
		}
		
		else if (m > M_MAX || n > N_MAX) {
			System.out.println("ERROR, end of program, numbers should be smaller than\n M_MAX = " + M_MAX + " and N_MAX = " + N_MAX);
			System.exit(0);
		}
		
		else {
			System.out.println("Result 1, simple multiplication: m * n = " + (m*n));
			System.out.println("Result 2, recursive multiplication: m * n = " + recMult(m, n, product));
			product = 0;
			System.out.println("Result 3, iterative multiplication: m * n = " + iterMult(m, n, product));
		}
		
		
		input.close(); //Close the scanner object
	}
	public static int recMult(int m, int n, int product) { //function to recursively calculate the product of two numbers
		if (n != 0) {
			product += m;
		}
		else {
			return product;
		}
		return recMult(m, n-1, product);
	}
	
	public static int iterMult(int m, int n, int product) { //function to iteratively calculate the product of two numbers
		if (m < n) {
			for (int i = 0; i < m; ++i) {
				product += n;
			}
		}
		else {
			for (int i = 0; i < n; ++i) {
				product += m;
			}
		}
		return product;
	}

}

/*
Enter two natural numbers, 'm' and 'n', both less than
1000 and 1001
M: 32
N: 5
Result 1, simple multiplication: m * n = 160
Result 2, recursive multiplication: m * n = 160
Result 3, iterative multiplication: m * n = 160
*/
