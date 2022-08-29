package hw11Abstraction.copy.copy.copy;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	/*
	 * It is not possible to extend a regular Class to a parent Abstract class. In
	 * Abstract Class we have some Abstract methods which can not be implemented in
	 * a regular Class. Only possible if we non-implement the methods of Abstract
	 * class in a Regular Class. We can only get implement the methods in a regular
	 * Class. To implement the methods of Abstract class in a regular Class we have
	 * to use the Annotation @override. By using over ride annotation we can only
	 * use the methods of abstract class otherwise we will get an error. A regular
	 * class can inherit other regular class by extends keyword. It also can inherit
	 * Abstract class by using extend keyword But we must implement the methods of
	 * Abstract class which are not implemented. If the methods are implemented in a
	 * regular class it will provide @override annotation
	 * 
	 * @override annotation means that this method is inherited from other abstract
	 * class. A regular class can inherit from the Interface by using Implement
	 * Keyword Implement keyword can be use to Inherit from the Interfaces. A class
	 * can inherit from multiple Interfaces.
	 */
	public ColumbiaUniversity() {
		// Default constructor
		// Yes we can create a constructor here because ColumbiaUniversity is a regular
		// class.
		System.out.println("This is default constructor from Columbia univeristy regular class");

	}

	public static void columbiaBranch2() {

		System.out.println("columbuia branch 2 from static method from comlumbia university.");
	}

	public void chemistry() {
		System.out.println("I used to have difficulty in solving problems.");

	}
	/*
	 * public abstract void (); We can not make abstract method here because
	 * abstract methods are only used in Abstract Classes. Or we can use the
	 * abstract keyword in the interface which is naturally abstract.
	 */

	@Override
	public void commonRoom() {
		System.out.println("All students have common room in school");
	}

	@Override
	public void laboratory() {
		System.out.println("we have laboratories in school");
	}

	@Override
	public void languageClub() {
		System.out.println("we take ESL classes for English language");
	}

	@Override
	public void emergencyRoom() {
		System.out.println("we have all the facility in the emergency room ");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("we operate surgeries here.");
	}

	@Override
	public void cafeteria() {
		System.out.println("our cafetaria is very clean and has delicouse food");
	}

	@Override
	public void lawInfo() {
		System.out.println("all citizen must have general law information.");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("It's study about aeroplanes");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("where should we go and when");
	}

	@Override
	public void classSize() {
		System.out.println("how big the class is?");
	}

	@Override
	public void playGround() {
		System.out.println("we have big play ground in our University");
	}

	@Override
	public void teacher() {
		System.out.println("we have 50 teachers in school.");
	}

	@Override
	public void bioChemistryLab() {
		System.out.println("Biochemistry lab is also there");
	}

	@Override
	public void caring() {
		System.out.println("we all should be caring");
	}

	@Override
	public void compurtLab() {
		System.out.println("we should run a bootcamp for programming.");
	}
}
