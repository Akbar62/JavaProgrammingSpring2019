package day22_loops_practice;

import java.util.*;

public class JSON {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();

		if (!json.contains("Name")) {
			System.out.println("Invalid input!");
			return;
		}

		String firstName = "First name: "+json.substring(json.indexOf("firstName\":")+13,json.lastIndexOf("\"last")-3);
		String lastName = "Last name: "+json.substring(json.indexOf("lastName\":")+12,json.lastIndexOf("\"role")-3);
		System.out.println(firstName);
		System.out.println(lastName);

}

}
