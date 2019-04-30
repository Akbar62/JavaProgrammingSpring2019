package day30_methods02;

import java.util.*;

public class WarmUpMethods {

	public static void main(String[] args) {

		print5Stars(); // Calling the method
		// Call the method 100 times

		for (int i = 1; i <= 100; i++) {
			print5Stars();
		}

		introduce();
		
	}

	public static void print5Stars() {
		System.out.println("*****");
	}

	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, " + name);
	}

}
