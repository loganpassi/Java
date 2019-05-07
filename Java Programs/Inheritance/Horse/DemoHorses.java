/*
 * Logan Passi
 * CIS2571
 * 04/02/19
 * DemoHorses.java
 * 
 * Program that utilizes Horse.java and RaceHorse.java to make Horse
 * objects and RaceHorse objects.
 */
package proj1;

public class DemoHorses {

	public static void main(String[] args) {
		 Horse horse1 = new Horse();
		 RaceHorse horse2 = new RaceHorse();
		 
		 horse1.setName("Old Paint");
		 horse1.setColor("brown");
		 horse1.setBirthYear(2011);
		 
		 horse2.setName("Champion");
		 horse2.setColor("black");
		 horse2.setBirthYear(2012);
		 horse2.setRaces(4);
		 
		 System.out.println(horse1.getName() + " is " + horse1.getColor() + " and was born in " +
		 horse1.getBirthYear() + ".");
		 
		 System.out.println(horse2.getName() + " is " + horse2.getColor() + " and was born in " +
		 horse2.getBirthYear() + ".");
		 
		 System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
		 
		 RaceHorse horse3 = new RaceHorse("Silver", "White", 2003, 5);
		 System.out.println(horse3);
		 
	}

}


/*
Old Paint is brown and was born in 2011.
Champion is black and was born in 2012.
Champion has been in 4 races.

Name: Silver
Color: White
Birth Year: 2003
Completed Races: 5
*/
