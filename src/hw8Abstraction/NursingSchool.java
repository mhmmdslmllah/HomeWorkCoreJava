package hw8Abstraction;

public abstract class NursingSchool {
	public void hygiene() {
		System.out.println("Nurses are very hygienic");

	}
	
	public abstract void caring();
	
	
	
	public NursingSchool() {
		System.out.println(" Yes! we can create a default constructor in Abstarct Class.");
	}
}
