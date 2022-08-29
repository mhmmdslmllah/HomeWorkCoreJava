package hw11Abstraction.copy.copy.copy;

public abstract class MedicalSchool extends NursingSchool {
	/*
	 * We can not create a object of Abstract class.
	 * Inheritance in Abstract Classes can extended by using "extend" keyword. Only
	 * one Abstract Class can be extended or one Regular Class. We can not extend
	 * multiple Abstract Classes or Regular classes for multiple inheritance. We can
	 * not use comma " ," for the multiple extensions between Abstract Classes or
	 * Regular Classes. Which is only allow in between Interfaces only. Abstract
	 * Class can be extended to another Abstract Class by using extend keyword.
	 * extend keyword is used for the inheritance between abstract class. An
	 * Abstract class can inherit other Abstract class or regular class. An Abstract
	 * class can inherit an Interface by using Implement keyword. An abstract can
	 * inherit from Multiple Interface by Implement keyword If inheriting from
	 * Interfaces there must be a "comma" between Interfaces.
	 */
	public void anatomyLab() {
		System.out.println("You will find many skeletons inside the AnatomyLab.");

	}

	public abstract void bioChemistryLab();

}
