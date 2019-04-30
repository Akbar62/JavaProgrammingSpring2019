package day16_string_manipulation;
import java.util.*;
public class NonStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given 2 strings, return their concatenation, except omit the first char of
		 * each. The strings will be at least length 1.
		 * 
		 * nonStart("Hello", "There") → "ellohere" 
		 * nonStart("java", "code") → "avaode"
		 * nonStart("shotl", "java") → "hotlava"
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in word 1");
		String a = scan.next();
		System.out.println("Enter in word 2");
		String b = scan.next();
		
		System.out.println(a.substring(1)+b.substring(1));
		
	}

}
