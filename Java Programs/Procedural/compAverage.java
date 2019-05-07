/*
 * Logan Passi
 * CIS2571
 * 02/12/19
 * compAverage.java
 * 
 * Simple program that asks the user for input, computes the average of the numbers and also keeps track
 * of how many positive and negative numbers were entered using a string
 */
import java.util.Scanner;

public class compAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numStr = "", numStrDelim = "";
		int num = 0, counter = 0, posNum = 0, negNum = 0;
		double avg = 0.0, sum = 0.0;
		System.out.print("Enter some integers separated by a space, the input ends of it is 0:");
		numStr = input.nextLine();
		numStrDelim = numStr.split(" 0")[0];
		input.close();
		
		for (; counter < numStrDelim.length(); ++counter) {
			while (numStr.charAt(counter) == ' ') {
				++counter;
			}
			
			num = Integer.parseInt(numStrDelim.substring(counter));
			
			if (num < 0) {
				++negNum;
			}
			
			else if (num > 0) {
				++posNum;
			}
			
			sum += num;
		}
		
		if (counter == 0)
			avg = 0;
		else
			avg = sum/counter;
		
		System.out.println("The number of positives is " + posNum);
		System.out.println("The number of negatives is " + negNum);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + avg);
	}
}
