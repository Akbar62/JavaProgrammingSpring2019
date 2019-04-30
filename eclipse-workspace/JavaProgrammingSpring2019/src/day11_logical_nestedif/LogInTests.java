package day11_logical_nestedif;
import java.util.*;
public class LogInTests {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username, password;
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		System.out.println("Enter in your username and password");
		username = scan.next();
		password = scan.next();
		
		  if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
				System.out.println("Login successful, welcome!");
				
		} else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid username and password");
			
		} else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid password");
			
		} else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid username");
		}

	}

}
