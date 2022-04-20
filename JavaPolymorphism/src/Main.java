/*
 * Polymorphism is creating multiple class that extended to the base 
 * class example code below the base class is Human object
 * Polymorphism came in because you can call all created class in the
 * base object using their object method
 */
public class Main {

	public static void main(String[] args) {
		Human h = new Human();
		Human w = new Walk();
		Human j = new Jump();
		h.human();
		w.humanInfo();
		j.humanInfo();		
	}

}
