
public class Encapsulation1 {
	/*
	 * When you create a private method you must set a public method
	 * to access the private within this Encapsulation file
	 */
	private String name;
	private int age;
	
	public void setInfo(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	/*
	 * When you set a private modifier you have to return 
	 * the value of variable declared to the modifier
	 * 
	 * Method for return value don't need to have a parameter
	 */
	
	public String getNameInfo() {
		return name;
	}
	
	public int getAgeInfo() {
		return age;
	}
	
	
}
