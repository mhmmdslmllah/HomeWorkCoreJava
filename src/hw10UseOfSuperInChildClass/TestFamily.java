package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		
		
		System.out.println("-----Deafult contructor initialized from Daughter class-----");
		Daughter daughter01 = new Daughter();
		
		System.out.println("-----Parameter contructor initialized from Daughter class-----");
		Daughter daughter02 = new Daughter("January: ", 20 );
		
		System.out.println("-----void type method initialized from Daughter class-----");
		daughter02.daughterInfo();
		
		System.out.println("-----Parametarized method initialized from Daughter class-----");
		daughter02.daughter("Lara:", 22);
		
		
		System.out.println("-----Deafult contructor initialized from Father class-----");
		Father father01 = new Father();
		
		System.out.println("-----Parametarized contructor initialized from Father class-----");
		Father father02 = new Father("John: ", 55, 'M', true, "Walmart");
		
		System.out.println("-----void type method initialized from Father class-----");
		father02.fatherData();
		
		System.out.println("-----Parametarized method initialized from Father class-----");
		father02.fatherInfo("David, ", 40, 'M', false, "Disney");
		
		
	}

}
