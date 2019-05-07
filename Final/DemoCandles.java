/*
 * Logan Passi
 * CIS2571
 * 05/07/19
 * DemoCandles.java
 * 
 * File the implements the Candle.java and ScentedCandle.java classes
 */
package temp;

public class DemoCandles {

	public static void main(String[] args) {
		//Create a Candle Obj
		Candle c = new Candle("Teal", 4);
		
		//Create a ScentedCandle Obj
		ScentedCandle sc = new ScentedCandle("Burgundy", 7, "Sweet");
		
		//Print out the information of both using the toString() method
		System.out.println(c.toString());
		System.out.println(sc.toString());
	}

}


/*
========Candle Object========

Color: Teal
Height: 4in
Price: $8.00

======Scented Candle Object======

Color: Burgundy
Height: 7in
Scent: Sweet
Price: $21.00
*/