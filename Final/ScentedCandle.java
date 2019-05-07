/*
 * Logan Passi
 * CIS2571
 * 05/07/19
 * ScentedCandle.java
 * 
 * ScentedCandle Class, Final Exam
 */
package temp;

public class ScentedCandle extends Candle{
	
	//Private Data Member
	private String scent;
	
	//Default Constructor
	public ScentedCandle() {
		super();
		scent = "";
	}
	
	//Parameterized Constructor
	public ScentedCandle(String c, int h, String s) {
		super(c, h);
		scent = s;
	}
	
	//Function to Calculate the Price of the Candle
	//and Override the super.CalcPrice()
	public void calcPrice() {
		super.price = 3 * super.height;
	}
	
	//Setter
	public void setScent(String s) {
		scent = s;
	}
	
	//Getter
	public String getScent() {
		return scent;
	}
	
	public String toString() {
		return "\n======Scented Candle Object======\n"
				+ "\nColor: " + super.getColor()
				+ "\nHeight: " + super.getHeight() + "in"
				+ "\nScent: " + scent
				+ "\nPrice: $" + super.twoDeci.format(super.getPrice());
				
				
	}

}
