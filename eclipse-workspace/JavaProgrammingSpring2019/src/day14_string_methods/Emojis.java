package day14_string_methods;
import java.util.*;
public class Emojis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String emoji = ":)";
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(emoji.length()!=2) {
			System.out.println("Invalid emoji!");
			return; 
		} if(first == ':') { 
			if(second == ')') {
				System.out.println("smile");
			} else if (second == '(') {
				System.out.println("sad");
			} else if (second == '/') {
				System.out.println("upset");
			} else if (second == 'p') {
				System.out.println("playful");
			} 
		}else if(first == ';') {
				
		}else if(first == ')') {
				
		} else {
			System.out.println("Invalid emoji");
		}
		}

	//convert to switch statement
	

}
