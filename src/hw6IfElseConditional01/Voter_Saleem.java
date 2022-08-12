package hw6IfElseConditional01;

public class Voter_Saleem {

	public static void main(String[] args) {
		String name = "Saleem";
		int age = 18;

		if (age ==18) {// if it is 17 then it will print the line 12, here value is 18 so it will print
						// the line 10.
			System.out.println("Yes! Mr " + name + " you are eligible for vote casting:-)");
		} else if (age < 18) {
			System.out.println("Sorry! Mr " + name + " you are not eligible for vote casting:-(");
		} else if (age > 18 ) {
			System.out.println("Congratulation on your first voting!");
		} else {System.out.println("Please add a valid age ");

	}
	}
	
}