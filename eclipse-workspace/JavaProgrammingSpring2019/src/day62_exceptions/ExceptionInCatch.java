package day62_exceptions;

public class ExceptionInCatch {
	public static void main(String[] args) {
		String str = "10j";

		try {
			int n = Integer.valueOf(str);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(str.charAt(10));
			System.out.println("hello from the catch block");
		} finally {
			System.out.println("hello from the finally block");
		}
		
		System.out.println("bye");

	}

}
