package proj1;

import proj1.Auto.AntiLockBrakes;
import proj1.Auto.CruiseControl;
import proj1.Auto.PowerSteering;

public class Models {
	
	public class Model1 extends Auto implements PowerSteering {
		Model1() {
			display();
		};
		public void display() {
			System.out.println("\n============Model1 Obj============\nPower Steering Included!");
		}
	};
	
	public class Model2 extends Auto implements AntiLockBrakes, CruiseControl{
		Model2() {
			display();
		}
		public void display() {
			System.out.println("\n============Model2 Obj============\nAnti-Lock Brakes Included!\nCruise Control Included!");
		}
	};
	
	public class Model3 extends Auto implements CruiseControl{
		Model3() {
			display();
		}
		public void display() {
			System.out.println("\n============Model3 Obj============\nCruise Control Included!");
		}
	};

}
