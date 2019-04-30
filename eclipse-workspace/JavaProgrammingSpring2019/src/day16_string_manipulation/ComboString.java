package day16_string_manipulation;
import java.util.*;
public class ComboString {

	public static void main(String[] args) {
		/*
		 * Given 2 strings, a and b, return a string of the form short+long+short, with
		 * the shorter string on the outside and the longer string on the inside. The
		 * strings will not be the same length, but they may be empty (length 0).
		 * 
		 * 
		 * comboString("Hello", "hi") → "hiHellohi" 
		 * comboString("hi", "Hello") → "hiHellohi"
		 * comboString("aaa", "b") → "baaab"
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in first word");
		String a = scan.next();
		System.out.println("Enter in second word");
		String b = scan.next();
		
		if (a.length() > b.length()) {
			System.out.println(b+a+b);
		} else if (b.length() > a.length()) {
			System.out.println(a+b+a);
		}

	}

}
