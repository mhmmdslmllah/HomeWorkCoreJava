package hw6IfElseCondition02;

import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature for the forecaste");
		
		int todaysTemp = sc.nextInt();
		System.out.println(todaysTemp);
		
		if (todaysTemp < 32) {// Today's temperature 32 so it prints "Pleasent". in the console.
			System.out.println("Freezing");
		} else if(todaysTemp<55) {
				System.out.println("Pleasent");
		} else if (todaysTemp<73) {
			System.out.println("Getting warmer");
		} else if (todaysTemp<101) {
			System.out.println("Hot");
		
		}
		sc.close();
		}
	}
	
