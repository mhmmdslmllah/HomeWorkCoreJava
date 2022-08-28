package hw11Abstraction.copy.copy.copy;

public interface Hospital {
	
	public void emergencyRoom();
	
	public void surgeryRoom();
	
	public void cafeteria();
	
	public static void pharmacy() {
		System.out.println("We have a pharmacy inside the Hospitol.");
	}
	public default void reception() {
		System.out.println("they have a welcoming recption in the Hospitol.");
	}
}
