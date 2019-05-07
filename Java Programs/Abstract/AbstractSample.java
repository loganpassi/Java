package proj;

public class AbstractSample {
	
	abstract class Vehicle {
		abstract int numWheels();
	}
	
	class Car extends Vehicle {
		int numWheels() {
			return 4;
		}
	}
	
	class Truck extends Vehicle {
		int numWheels() {
			return 8;
		}
	}

	public static void main(String[] args) {
		AbstractSample ab = new AbstractSample();
		Vehicle v1 =  ab.new Car();
		System.out.println("A car has " + v1.numWheels() + " number of wheels.");
		
		v1 = ab.new Truck();
		System.out.println("A truck has " + v1.numWheels() + " number of wheels.");
		

	}

}
