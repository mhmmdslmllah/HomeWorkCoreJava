package hw11Abstraction.copy.copy.copy;

public abstract class NursingSchool extends RockefellerUniversity implements LawSchool {
	public void hygiene() {
		System.out.println("Nurses are very hygienic");

	}

	
	
	public abstract void caring();

	public NursingSchool() {
		System.out.println("Yes! we can create a default constructor in Nursing Abstarct Class.");
	}
}
