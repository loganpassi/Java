/*
 * Logan Passi
 * CIS2571
 * 03/19/2019
 * testMyPoint.java
 * 
 * Program that creates a MyPoint object
 */
package proj1;

public class testMyPoint {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		
		System.out.println(p1.distance(p2));
		System.out.println(MyPoint.distance(p1, p2));
		
		MyPoint p3 = new MyPoint(5, 7.2);
		System.out.println(p3);


	}

}


/*
Distance: 32.09750769140807
Distance: 32.09750769140807

X: 5.0
Y: 7.2
*/