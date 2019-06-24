package day62_exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		String str = "selenium";
		
		try {
			System.out.println(str.length());
			//System.out.println(str.charAt(0));
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Enter the correct index");
			return;
			// even tho theres a return, the finally block still runs
		} finally {
			System.out.println("Finally block");
		}
		
		// finally always runs
		// ***unless 
		// System.exit(0)
		// something JVM crash
		
		System.out.println("After try catch finally blocks");
	}
}
