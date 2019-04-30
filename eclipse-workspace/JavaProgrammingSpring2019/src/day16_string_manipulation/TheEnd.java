package day16_string_manipulation;

public class TheEnd {

	public static void main(String[] args) {

		/*
		 * Given a string, return a string length 1 from its front, unless front is
		 * false, in which case return a string length 1 from its back. The string will
		 * be non-empty.
		 * 
		 * theEnd("Hello", true) → "H"
		 * theEnd("Hello", false) → "o" 
		 * theEnd("oh", true) → "o"
		 * 
		 */

		String str = "Hello";
		boolean front = true;
		
		if(front == true) {
			System.out.println(str.charAt(0));
			return;
		} else if (front == false) {
			System.out.println(str.substring(str.length()-1));
		}
		
		

	}

}
