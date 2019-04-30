package day16_string_manipulation;
import java.util.*;
public class UrlMurodil {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter URL");
		String url = scan.next();
		
		if(url.startsWith("www.")) {
			System.out.println("It starts with www.");
		} else {
			System.out.println("Invalid URL");
		}
		
		int dotIndex = url.length() - 4;
		
		if(url.charAt(dotIndex) == '.') { 
			System.out.println("Dot is there before extension");
		} else {
			System.out.println("'.' might be misplaced");
		}
			
		
		/* if(url.charAt(url.length() - 4);
		 * 
		 * 
		 * 
		 */
		
		
		String domain = url.substring(4, dotIndex);
		System.out.println("The domain is "+domain);
		
		String extension = url.substring(dotIndex);
		System.out.println("The extension is "+extension);
	}

}
