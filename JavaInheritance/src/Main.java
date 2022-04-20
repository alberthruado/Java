/*
 * Inheritance is inheriting all information from the class extended
 * for example FamilyTree have a different bunch of information then
 * the FamilyTree class are extend from GrandFather class all 
 * information from FamilyTree will be inherited to GrandFather class 
 */
public class Main {

	public static void main(String[] args) {
		
		FamilyTree family = new FamilyTree();
		family.familytree();
		family.grandfather();
		family.grandmother();
		family.father();
		family.sister();
		family.brother();
		
		Grandfather grandfathers = new Grandfather();
		grandfathers.grandfather();
		

		GrandMother grandmothers = new GrandMother();
		grandmothers.grandmother();
		
		
		Mother mothers = new Mother();
		mothers.mother();

		
		Father fathers = new Father();
		fathers.father();
		
		
		Sister sisters = new Sister();
		sisters.sister();
	
		
		Brother brothers = new Brother();
		brothers.brother();

		
		Siblings siblings = new Siblings();
		siblings.siblings();

		
	}

}
