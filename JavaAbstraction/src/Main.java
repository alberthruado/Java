
abstract class Name {
	public void firstname() {
		System.out.print("Juan ");
	}
}

class Fullname extends Name {
	public void lastname() {
		System.out.println("Dela Cruz");
	}
}

public class Main {

	public static void main(String[] args) {
		/*
		 * Declaring object for abstract class to call the method
		 * is not gonna work because you cannot call the abstract 
		 * class like initial class.
		 * 
		 * In order to call the method from the abstract class you
		 * have to create a class then extends the abstract class Name
		 * to the class.
		 * 
		 * This not code not gonna work
		 * Name name = new Name();
		 * name.firstname();
		 * 
		 * Example code below the comment
		 */
		
		Fullname fullname = new Fullname();
		
		System.out.println("Fullname: ");
		fullname.firstname();
		fullname.lastname();
		

	}

}
