/*
 * Logan Passi
 * CIS2571
 * 04/09/19
 * testProg.java
 * 
 * This program demonstrates multilevel inheritance.
 */

package proj1;


class Game {
	Game(int i){
		System.out.println("Game Constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame Constructor");
	}
}

class Chess extends BoardGame {
	Chess(){
		super(11);
		System.out.println("Chess Constructor");
	}
}

/*
class A {
	A(){
		System.out.println("A()");
	}
}

class B{
	B(){
		System.out.println("B()");
	}
}

class C extends A {
	B b = new B();
	C() {
		System.out.println("C()");
	}
}
*/
public class testProg {

	public static void main(String[] args) {
		//C obj = new C(); //C extends A, then object B is created
		Chess x = new Chess();
		

	}


}
