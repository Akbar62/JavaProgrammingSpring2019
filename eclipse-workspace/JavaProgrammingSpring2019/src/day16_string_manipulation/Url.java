package day16_string_manipulation;
import java.util.*;
public class Url {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter URL");
		String url = scan.next();
		
		if(url.startsWith("www.")) {
			System.out.println("It starts with "+"www.");
			int secondDot = url.indexOf("." , 4);
			System.out.println("The second '.' is located at "+secondDot);
		} if(url.contains(".com")) {
			System.out.println("Domain is .com");
		} else if (url.contains(".net")) {
			System.out.println("Domain is .edu");
		} else if (url.contains(".org")) {
			System.out.println("Domain is .org");
		} else if (url.contains(".gov")) {
			System.out.println("Domain is .org");
		}

	}

}
