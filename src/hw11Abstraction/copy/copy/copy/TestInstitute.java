package hw11Abstraction.copy.copy.copy;

public class TestInstitute {
	public static void main(String[] args) {

		System.out.println("\n-----------Regular class of Columbia university------------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.chemistry();
		System.out.println("\n-------below methods are override from other classes or interfaces---------\n");
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.bioChemistryLab();
		columbiaUniversity.caring();
		columbiaUniversity.compurtLab();
		ColumbiaUniversity.columbiaBranch2();  // We can call the static method of Regular class by name without any errors. 
		//columbiaUniversity.columbiaBranch2();//       we can call a static method branch 2 from ColumbiuaUniversity. but it is giving us warning.
		
		System.out.println("\n-------**Calling same methods from ColubiaUniversity by top casting **---------\n");
		
		//Here child class object can be call by parent Interface reference variable. We can also call it (TOP CASTING).*** 
		University university = new ColumbiaUniversity(); // We can't create an object of Interface. we took help from the ColumbiaUniverity concrete class to instantiate. 
		                                                                  //concrete class here is ColumbiaUniversity because we implements the the methods and functions in a regular class. 
		university.classSize();
		university.playGround();
		university.teacher();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.cafeteria();
		university.emergencyRoom();
		university.surgeryRoom();
		university.gymnasuim(); 
		//university.library();      // we can call the static method from Interface by the help of Interface name.
		University.library();        //It's a static methods in University Interface it's possible to call but not it's not working in Interface of College interface.
		System.out.println(University.established);  // to call the variable we have to put variable inside the brackets. such as here.
		//University.established      *We can't call static/final variable of interface by object but we have to call it by itself Interface or Class name. 
		university.dorm();
	//	University.studyRoom(); // College Interface can't even call by Interface name why? even it's static method
	//	University.pharmacy();
		university.reception(); // I can a default method here by parent Interface reference variable.
		
		System.out.println("\n-------**Calling methods from MedicalSchool Absrat Class**---------\n");\
		
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		//Tried to create an object of Abstract class but gives error of (cannot instantiate the type MedicalSchool).
		//Here we can do the top casting now. Here we are calling the child class object by parent Abstract class reference variable.
		medicalSchool.anatomyLab();
		medicalSchool.bioChemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.math();
		medicalSchool.aeronauticalInfo();
		medicalSchool.compurtLab();
		medicalSchool.anthropology();
		medicalSchool.lawInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.compurtLab();
		
	}

}
