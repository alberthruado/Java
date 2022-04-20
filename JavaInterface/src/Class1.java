/*
 * Class is for what you need to do from interface
 */
public class Class1 implements Interface1 {
	
	/*
	 * String firstname="Juan",middlename="jdlc",lastname="DelaCruz";
	 * You can create this kind of code but I don't recommed it even if
	 * it also worked.
	 */
	
	
	String firstname,middlename,lastname;
	
	/*
	 * Class1() is a constructor for the String firstname, middlename
	 * lastname
	 */
	public Class1() {
		firstname = "Juan";
		middlename = "jdlc";
		lastname = "DelaCruz";
		
	}
	
	/*
	 * Method for the constructor
	 * the method firstname(), middlename() and lastname()
	 * came from the Interface1.
	 * 
	 * return firsname, return middlename and return lastname
	 * came from the String declaration we return the variable of 
	 * String to get the value of the constructor Class1 
	 *
	 * method created from function should have return value
	 * 
	 */
	public String firstname() {
		
		return firstname;
		
	}
	public String middlename() {
			
		return middlename;
			
	}
	public String lastname() {
		
		return lastname;
		
	}
	
	
	public void fullname() {
		System.out.println(" Fullname: " + firstname + " " + middlename + " " + lastname);
	}
	
	/*
	 * Private method accessor
	 */
	
	public void getHelloWorld() {
		HelloWorld();
	}
	
	/*
	 * Private method can only access to Public method
	 */
	private void HelloWorld() {
		System.out.println(" Hello World");
	}
	
}
