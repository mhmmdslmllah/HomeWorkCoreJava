package hw10UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// Default constructor
	public Father() {
		System.out.println("Default constructor from father class");

	}

	public Father(String name, int age, char sex, boolean usCitizen, String familyName) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		this.familyName = familyName;
		System.out.println("Father name: " + name + "Age:" + age + "Gender: " + sex + "Citizen ship" + usCitizen + "Family name: " + familyName );
	}

	public void fatherData() {
		System.out.println("This is a father method from Father class ");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen, String familyName) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		this.familyName = familyName;
		System.out.println("Father name: " + name + " Age: " + age + "Gender: " + sex + " Citizen ship: " + usCitizen + " Family name: " + familyName );

	}

}
