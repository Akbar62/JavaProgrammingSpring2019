package day20_forLoop;

import java.util.*;

public class RealParty {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String name = "";
		String newGuest = "";
		String answer = "";
		String list = "";

		System.out.println("Please enter guest name:");
		name = input.nextLine();

		System.out.println("Do you want to enter new guest name:");
		answer = input.nextLine();

		while (answer.equalsIgnoreCase("yes")) {

			System.out.println("Please enter guest name:");
			name = input.nextLine();
			
			System.out.println("Do you want to enter new guest name:");
		    answer = input.nextLine();
		    
		    name = ","+ name;

		}
		
		if(answer.equalsIgnoreCase("no")) {
			System.out.println("Guest list: "+name);
		}
		
		System.out.println(name);

	}

}
