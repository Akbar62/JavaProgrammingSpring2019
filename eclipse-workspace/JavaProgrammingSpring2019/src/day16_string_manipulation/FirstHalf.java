package day16_string_manipulation;
import java.util.*;
public class FirstHalf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a word with an even amount of characters");
		String str = scan.next();
		
		if(str.length() % 2 ==0) {
		String firstHalf = str.substring(0 , str.length()/2);
		System.out.println(firstHalf);
			
		} 

	}

}
