
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Object for Encapsulation
		 */
		
		Encapsulation1 info =  new Encapsulation1();
		
		/*
		 * Call the setMethod from the Encapsulation1 file
		 * And assign the value of the method by the object
		 */
		info.setInfo("Juan DelaCruz", 45);
		
		/*
		 * Call the getMethod to print the value of the object set
		 * from the setMethod
		 */
		System.out.println(info.getNameInfo());
		System.out.print(info.getAgeInfo());

	}

}
