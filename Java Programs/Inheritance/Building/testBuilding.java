// This program tests two classes: Building and House
// The purpose of this program is to test class design
// using Java inheritance
package proj1;

public class testBuilding {

	public static void main(String[] args) {
		
		   House H1 = new House(10,5);
	       H1.setFloors(3);
	       H1.setRooms(15);
	       H1.setTotSqFt(3000.0);
	       System.out.println(H1);
	       
	       House H2 = new House();
	       System.out.println(H2);
	       
	       Office Off1 = new Office(20, 100);
	       Off1.setFloors(10);
	       Off1.setRooms(200);
	       Off1.setTotSqFt(10000.0);
	       
	       System.out.println(Off1);
	       Office Off2 = new Office();
	       System.out.println(Off2);

	}

}


/*
Number of Floors: 3
Number of Rooms: 15
Square Footage: 3000.0
Number of Bedrooms: 10
Number of Bathrooms: 5

Number of Floors: 0
Number of Rooms: 0
Square Footage: 0.0
Number of Bedrooms: 0
Number of Bathrooms: 0

Number of Floors: 10
Number of Rooms: 200
Square Footage: 10000.0
Number of Fire Extinguishers: 20
Number of Telephones: 100

Number of Floors: 0
Number of Rooms: 0
Square Footage: 0.0
Number of Fire Extinguishers: 0
Number of Telephones: 0
*/