package hw9Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool {

	// Inheritance in Abstract Classes can extended by using "extend" keyword.
	// Only one Abstract Class can be extended or one Regular Class.
	// We can not extend multiple Abstract Classes or Regular classes for multiple
	// inheritance.
	// We can not use comma " ," for the multiple extensions between Abstract
	// Classes or Regular Classes. Which is only allow in between Interfaces only.
	// Abstract Class can be extended to another Abstract Class by using extend
	// keyword.

	public void anatomyLab() {
		System.out.println("You will find many skeletons inside the AnatomyLab.");

	}

	public abstract void bioChemistryLab();

}
