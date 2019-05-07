/*
 * Logan Passi
 * CIS2571
 * 02/12/19
 * compAvg.java
 * 
 * Simple program that asks the user for input, computes the average of the numbers and also keeps track
 * of how many positive and negative numbers were entered
 */

//import scanner to get input from the suer
import java.util.Scanner;
import java.text.*;

public class compAvg {

	public static void main(String[] args) {
	
	DecimalFormat twoDeci = new DecimalFormat("0.00");
	Scanner input = new Scanner(System.in);
	int num = 0, counter = 0, posNum = 0, negNum = 0;
	double avg = 0.0, sum = 0.0;
		

		System.out.print("Enter an integer, the input ends if it is 0:");
		num = input.nextInt();
		
		while (num != 0) {
			++counter;
			sum += num;
			
			//if num is less than zero increment negNum
			if (num < 0) {
				++negNum;
			}
			
			//if num is greater than zero increment posNum
			else if(num > 0) {
				++posNum;
			}
			
			num = input.nextInt();
		}
		
		//close scanner object
		input.close();
		
		//if the counter is at zero set average to zero
		if (counter == 0)
			avg = 0;
		//otherwise calculate the average normally
		else
			avg = sum/counter;
		
		System.out.println("The number of positives is " + posNum);
		System.out.println("The number of negatives is " + negNum);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + twoDeci.format(avg));
	}

}

/*
Enter an integer, the input ends if it is 0:1
2
-1
3
0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25

===============================================================

Enter an integer, the input ends if it is 0:2
5
4
8
-8
0
The number of positives is 4
The number of negatives is 1
The total is 11.0
The average is 2.2

*/
