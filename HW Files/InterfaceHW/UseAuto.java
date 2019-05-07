/*
 * Logan Passi
 * CIS2571
 * 04/17/19
 * UseAuto.java
 * 
 * Abstract and Interface HW 1
 */
package proj1;

import proj1.Models.*;

public class UseAuto {

	public static void main(String[] args) {
		//Auto a = new Auto();
		Models m = new Models();
		Auto car = m.new Model1();
		car = m.new Model2();
		car = m.new Model3();
	}
}

/*

============Model1 Obj============
Power Steering Included!

============Model2 Obj============
Anti-Lock Brakes Included!
Cruise Control Included!

============Model3 Obj============
Cruise Control Included!
*/
