package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
//1.	
		Animal animal = new Animal(); // This is a Base Class of Birds, Mammals and Reptile
		animal.animalInfo(); // Also Parent Class
//2.		
		Birds birds = new Birds(); // Hierarchical inheritance
		birds.birdsInfo();
		birds.animalInfo(); // Single Inheritance
//3.		
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo(); // Multilevel Inheritance
//4.		
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo(); // Multilevel Inheritance
//5.		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
//6.		
		Mammal mammal = new Mammal(); // Hierarchical inheritance
		mammal.mammalInfo();
		mammal.animalInfo();
//7.		
		Reptile reptile = new Reptile(); // Hierarchical inheritance
		reptile.reptileInfo(); // Single Inheritance
		reptile.animalInfo();
//8.	
		Robin robin = new Robin();
		robin.RobinInfo();
		robin.birdsInfo();
		robin.animalInfo();
//9.	
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
	}

}
