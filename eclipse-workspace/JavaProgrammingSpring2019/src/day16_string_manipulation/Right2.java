package day16_string_manipulation;
import java.util.*;
public class Right2 {

	public static void main(String[] args) {

		/*
		 * Given a string, return a "rotated right 2" version where the last 2 chars are
		 * moved to the start. The string length will be at least 2.
		 * 
		 * right2("Hello") → "loHel" 
		 * right2("java") → "vaja"
		 *  right2("Hi") → "Hi"
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter in a word");
		String str = scan.next();
		
		String first = str.substring(str.length()-2);
		String second = str.substring(0, str.length()-2);
		
		System.out.println(first+second);

	}

}
