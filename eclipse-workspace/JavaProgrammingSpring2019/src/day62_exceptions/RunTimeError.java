package day62_exceptions;

public class RunTimeError {
	static int i = 0;
	public static void main(String[] args) {
		go();
		// anytime we create a method in java, it creates a frame
		// in stack memory
	}
	
	public static void go() {
		System.out.println(i + "going");
		i++;
		go(); // calls itself - recursive method , recursion
		// STACK OVERFLOW ERROR
	}

}
