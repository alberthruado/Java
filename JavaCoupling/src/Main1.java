/*	
 * Tight Coupling
 * 
 */
public class Main1 {
	
	/*
	 * Reference
	 * 
	 * The Doctor and Engineer are refer to the class name that you
	 * created
	 */
	Doctor doctor;
	Engineer engineer;
	
	/*
	 * public Main1 is a constructor method to call the variable 
	 * reference name.
	 * To call the variable reference the code example below
	 */
	public Main1(Doctor doctor, Engineer engineer) {
		
		/*
		 * The variable from this.doctor and this.engineer equals
		 * are from the method parameter to refer the Doctor and Engineer
		 * to a variable
		 * 
		 */
		this.doctor = doctor;
		this.engineer = engineer;
	}
	
	/*
	 * public void display() is method this part is refer to the
	 * construct the variable doctor and engineer are came from the 
	 * GLOBAL declaration from Doctor and Engineer class files
	 */
	
	public void display() {
		doctor.display();
		engineer.display();
	}
	
		
	public static void main(String[] args) {
		
		/*
		 * Creating objects for Doctor and Engineer
		 * Arrangement Doctor and Engineer constructor must be the same
		 * of the arrangement to the object method the example code below
		 * to see the difference
		 * 
		 */
		
		Doctor doc = new Doctor();
		Engineer eng = new Engineer();
		
		/*
		 * Main1 main1 = new Main1(eng,doc);
		 * The example code below will call undefined because the 
		 * the constructor parameter did follow to fix that
		 * the correct example code below
		*/
		 Main1 main1 = new Main1(doc, eng);
		main1.display();
	}

}
