package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println(" Please enter your Hemoglobin A1C");
		Scanner sc = new Scanner(System.in);
		double hbga1c = sc.nextDouble();
		System.out.println(hbga1c);
		
		if(hbga1c>6.4) {
			System.out.println("I am diabetic patient.");
		} else if(!(hbga1c>6.4)) {
			if(hbga1c>=5.7) {
				System.out.println("I am a pre-diabetic patient.");
				if (hbga1c<5.7) {
					System.out.println("I am a Healthy person.");
				}
			}else {
			System.out.println("Congratulation! you are not diabetic.");
		}  
		sc.close();
	} 
	}
	//New update
}
