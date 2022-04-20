
public class Main {

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		
		System.out.print(" Firstname: " + class1.firstname());
		System.out.print("\n Middlename: " + class1.middlename());
		System.out.println("\n Lastname: " + class1.lastname());
				
		class1.fullname();
		
		class1.getHelloWorld();
		
		/*
		 * override the method declared from Class1
		 */
		class2.firstname = "John";
		class2.middlename = "JD";
		class2.lastname = "Doe";
		class2.myclass2();
		
		
	}

}
