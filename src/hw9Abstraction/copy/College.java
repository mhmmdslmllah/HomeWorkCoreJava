package hw9Abstraction.copy;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This id the studyRoom method from the College Interface.");

	}

	public static void studyRoom () {
		System.out.println("This id the studyRoom method from the College Interface.");
		
	}
}