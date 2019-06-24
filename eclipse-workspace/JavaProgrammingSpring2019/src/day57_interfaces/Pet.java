package day57_interfaces;

public interface Pet {
	boolean friendly = true; // automatically public static final even if not declared
	
	public abstract void KeepAsPet();
	
	public default void play() {
		System.out.println("Playing hide and seek");
	}
	
	// static methods in interfaces are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with " + food);
	}
	
}
