
public class functions {

	public static void main(String[] args) {
	
	int value = sum(1, 10);
	System.out.println("The sum from 1 - 10 is " + value + ".");
	}
	
	//this function takes two arguments and returns the sum of both
	public static int sum(int startX, int endX) {
		
		int result = 0;
		
		for (int i = startX; i <= endX; ++i) {
			result += i;
		}
		
		return result;
	}

}
