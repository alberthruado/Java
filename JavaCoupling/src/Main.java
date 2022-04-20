/*
 * Loose Coupling
 * 
 */
public class Main {
	
	/*
	 * Job is refer to the Job interface and job is a variable to
	 * refer the Job reference
	 */
	Job job;
	
	/*
	 * Main is a constructor to refer the Job interface
	 */
	public Main(Job job) {
		/*
		 * The this.job is refer to the Job interface declare GLOBALY
		 * at the top to this file
		 * 
		 */
		this.job = job;
	}
	
	/*
	 * display method is to call all the method implemented to the 
	 * Job interface 
	 * 
	 */
	public void display() {
		job.display();
	}
	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		
		/*
		 * At this part you have to pass a parameter you declare into
		 * the Main constructor the parameter is engineer variable
		 * because engineer object is the only object declare 
		 * 
		 */
		Main main = new Main(engineer);
		main.display();

	}

}
