package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super(); // super method
		System.out.println("Default constructor from Daughter class.");
		super.fatherData();//
		super.fatherInfo("Mathew", 60, 'M', true, "October"); // Parameterized method initialized.
		super.familyName = "Walgreen"; // variable initialized from father class in child class.
	}

	public Daughter(String birthMonth, int age) {

		super("Peter", 65, 'M', false, "Meta");   //parameterized constructor from parent class.
		super.fatherData();                 //void type method from father class
		super.fatherInfo("Sam", 43, 'M', true, "September");      //Parameterized method initialized from base class
		super.familyName = "Bezos";  //variable initialized from parent class
		
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month: " + birthMonth + " Age: " + age);
	}

	public void daughterInfo() {
		//	super();    //       super method cannot be used inside the child class method.
		// It is only used to call the constructor of a parent class inside the child constructor
		super.fatherData();
		super.fatherInfo("Tom", 54, 'M', false, "December");
		super.familyName= "Walton";
		System.out.println("This is daughterInfo method from Daughter class.");
	}

	public void daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month: " + birthMonth + " Age: " + age);

	}

}
