package day23_loops_and_arrays;

import java.util.*;

public class BruteForce {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		int attempts = 5;
		String userName = "";
		String password = "";

		do {
			if (attempts <= 0) {
				System.out.println("You have exceeded the amount of incorrect attempts.");
				System.out.println("The user has been deactivated.");
				System.exit(0);
			}
			attempts--;
			System.out.println("Enter in a username");
			userName = scan.next();
			if (!userName.contentEquals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Number of attempts left is " + attempts);
				continue;
			}
			System.out.println("Enter in a password");
			password = scan.next();
			if (!password.contentEquals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Number of attempts left is " + attempts);
				continue;
			}
			// attempts--;

		} while (!userName.contentEquals(expectedUserName) || !password.contentEquals(expectedPassword));

		System.out.println("Login info is correct, access granted");

	}

}
