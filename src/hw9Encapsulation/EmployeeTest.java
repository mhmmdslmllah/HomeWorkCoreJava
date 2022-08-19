package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpName("Sarkar");
		emp.setEmpAge(45);
		emp.setEmpSex('M');
		emp.setEmpCitizen(false);

		System.out.println("EmployeeName: " + emp.getEmpName() + ",\nAge: " + emp.getEmpAge() + ",\nSex: "
				+ emp.getEmpSex() + ",\nCitizenship: " + emp.isEmpCitizen());
	}
//  Need to push it to the Git hub and share the link in the HW field. 
}
