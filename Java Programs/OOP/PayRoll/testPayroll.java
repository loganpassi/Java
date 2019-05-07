/*
 * Logan Passi
 * CIS2571
 * 03/19/2019
 * testPayroll.java
 * 
 * Program that creates multiple Payroll objects
 */

public class testPayroll {

	public static void main(String[] args) {
		
		final int ARR_SIZE = 5;
		
		//create an array of PayRoll objects
		Payroll[] employee = new Payroll[ARR_SIZE];
		
		employee[0] = new Payroll("Jane Doe", 35.95, 40);
		employee[1] = new Payroll("John Doe");
		employee[2] = new Payroll();
		employee[3] = new Payroll("Logan Passi");
		employee[4] = new Payroll("Paul Passi", 55.5, 30);
		
		for (int i = 0; i < ARR_SIZE; ++i) {
			employee[i].print();
		}
		
		for (int i = 0; i < ARR_SIZE; ++i) {
			System.out.print(employee[i]);
			System.out.println();
		}

	}

}


/*

Name: Jane Doe
Pay Rate: 35.95
Hours Worked: 40.0
Total Pay: 0.00

Name: John Doe
Pay Rate: 0.0
Hours Worked: 0.0
Total Pay: 0.00

Name: 
Pay Rate: 0.0
Hours Worked: 0.0
Total Pay: 0.00

Name: Logan Passi
Pay Rate: 0.0
Hours Worked: 0.0
Total Pay: 0.00

Name: Paul Passi
Pay Rate: 55.5
Hours Worked: 30.0
Total Pay: 0.00

*/