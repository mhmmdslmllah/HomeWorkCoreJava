package hw10Abstraction.copy.copy;

public interface University extends College, Hospital {
	/*
	* It can be extends because both are Interfaces.
	* Interfaces can be extend by using extend keyword only to other Interface..
	* From one Interface you can extends multiple Interfaces.
	* We can extend multiple Interfaces by giving comma " , " between parent Interfaces from the child Interface. 
	* Between Interfaces only extend keyword is used.
	*An Interface can inherit other Interfaces only. It can inherit multiple Interfaces.
	*An Interface cannot inherit abstract class or regular class.
	*/
	public void classSize();

	public void playGround();    // Declared method -----> Interfaces: Methods are not implemented.

	public void teacher();

	public default void gymnasuim() {
		System.out.println("This is gymnasium method from University Interface.");
	}

	public static void library() {
		System.out.println("This is library method from University Interface");
	}

}

//      In Interface we cannot create any object or constructors.
//     In Interface we can only Declare the methods.