package hw9Abstraction.copy;

public class ColumbiaUniversity {

	// It is not possible to extend a regular Class to a parent Abstract class.
	// In Abstract Class we have some Abstract methods which can not be implemented
	// in a regular Class.
	// Only possible if we non-implement the methods of Abstract class in a Regular
	// Class.
	// We can only get implement the methods in a regular Class.
	// To implement the methods of Abstract class in a regular Class we have to use
	// the Annotation @override.
	// By using over ride annotation we can only use the methods of abstract class
	// otherwise we will get an error.

	public ColumbiaUniversity() {
		// Default constructor
		// Yes we can create a constructor here because ColumbiaUniversity is a regular
		// class.

	}

	public void chemistry() {
		System.out.println("I used to have difficulty in solving problems.");

	}

	// public abstract void ();
	// We can not make abstract method here because abstract methods are only used
	// in Abstract Classes.
	// Or we can use the abstract keyword in the interface which is naturally
	// abstract.
}
